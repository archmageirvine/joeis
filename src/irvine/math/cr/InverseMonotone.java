package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Inverse of a monotonically increasing or decreasing function.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class InverseMonotone extends UnaryCRFunction {

  final UnaryCRFunction mFunc;
  // Monotone increasing.
  // If it was monotone decreasing, we negate it.
  final boolean mFuncNegated;
  final CR mLow;
  final CR mHigh;
  final CR mFuncLow;
  final CR mFuncHigh;
  // Bound on msd of both f(high) and f(low)
  final int mMaxMsd;
  // base^max_arg_prec is a small fraction of low - high.
  final int mMaxArgPrec;
  // Rough approximation of msd of first derivative.
  final int mDerivMsd;

  InverseMonotone(final UnaryCRFunction func, final CR l, final CR h) {
    mLow = l;
    mHigh = h;
    final CR tmpFuncLow = func.execute(l);
    final CR tmpFuncHigh = func.execute(h);

    // Since func is monotone and low < high, the following test converges.
    if (tmpFuncLow.compareTo(tmpFuncHigh) > 0) {
      mFunc = UnaryCRFunction.NEGATE.compose(func);
      mFuncNegated = true;
      mFuncLow = tmpFuncLow.negate();
      mFuncHigh = tmpFuncHigh.negate();
    } else {
      mFunc = func;
      mFuncNegated = false;
      mFuncLow = tmpFuncLow;
      mFuncHigh = tmpFuncHigh;
    }
    mMaxMsd = mLow.abs().max(mHigh.abs()).msd();
    mMaxArgPrec = mHigh.subtract(mLow).msd() - 4;
    mDerivMsd = mFuncHigh.subtract(mFuncLow).divide(mHigh.subtract(mLow)).msd();
  }

  private static final class InverseIncreasingCR extends CR {
    
    private final InverseMonotone mMono;
    private final CR mArg;

    InverseIncreasingCR(final InverseMonotone mono, final CR x) {
      mArg = mono.mFuncNegated ? x.negate() : x;
      mMono = mono;
    }
    
    // Comparison with a difference of one treated as equality.
    int sloppyCompare(final Z x, final Z y) {
      final Z difference = x.subtract(y);
      if (difference.compareTo(Z.ONE) > 0) {
        return 1;
      }
      if (difference.compareTo(Z.NEG_ONE) < 0) {
        return -1;
      }
      return 0;
    }
    
    @Override
    protected Z approximate(final int p) {
      final int extraArgPrec = 10; // increased by SAI on 2021-07-29 due to failures to converge
      final UnaryCRFunction fn = mMono.mFunc;
      // Number of preceding ineffective steps.  If this number gets >= 2,
      // we perform a binary search step to ensure forward progress.
      int smallSteps = 0;
      final int digitsNeeded = mMono.mMaxMsd - p;
      if (digitsNeeded < 0) {
        return Z.ZERO;
      }
      int workingArgPrec = p - extraArgPrec;
      if (workingArgPrec > mMono.mMaxArgPrec) {
        workingArgPrec = mMono.mMaxArgPrec;
      }
      int workingEvalPrec = workingArgPrec + mMono.mDerivMsd - 20;
      // initial guess
      // We use a combination of binary search and something like
      // the secant method.  This always converges linearly,
      // and should converge quadratically for well-behaved
      // functions.
      // F_l and f_h are always the approximate images of l and h.
      // At any point, arg is between f_l and f_h, or no more than
      // one outside [f_l, f_h].
      // L and h are implicitly scaled by working_arg_prec.
      // The scaled values of l and h are strictly between low and high.
      // If at_left is true, then l is logically at the left
      // end of the interval.  We approximate this by setting l to
      // a point slightly inside the interval, and letting f_l
      // approximate the function value at the endpoint.
      // If at_right is true, r and f_r are set correspondingly.
      // At the endpoints of the interval, f_l and f_h may correspond
      // to the endpoints, even if l and h are slightly inside.
      // F_l and f_u are scaled by working_eval_prec.
      // Working_eval_prec may need to be adjusted depending
      // on the derivative of f.
      boolean atLeft;
      boolean atRight;
      Z l;
      Z fLo;
      Z h;
      Z fHi;
      final Z lowAppr = mMono.mLow.getApprox(workingArgPrec).add(Z.ONE);
      final Z highAppr = mMono.mHigh.getApprox(workingArgPrec).subtract(Z.ONE);
      Z argAppr = mArg.getApprox(workingEvalPrec);
      final boolean haveGoodAppr = mApprValid && mMinPrec < mMono.mMaxMsd;
      if (digitsNeeded < 30 && !haveGoodAppr) {
        h = highAppr;
        fHi = mMono.mFuncHigh.getApprox(workingEvalPrec);
        l = lowAppr;
        fLo = mMono.mFuncLow.getApprox(workingEvalPrec);
        // Check for clear out-of-bounds case.
        // Close cases may fail in other ways.
        if (fHi.compareTo(argAppr.subtract(Z.ONE)) < 0 || fLo.compareTo(argAppr.add(Z.ONE)) > 0) {
          throw new ArithmeticException();
        }
        atLeft = true;
        atRight = true;
        smallSteps = 2; // Start with bin search step.
      } else {
        final int roughPrec;
        if (haveGoodAppr && (digitsNeeded < 30 || mMinPrec < p + 3 * digitsNeeded / 4)) {
          roughPrec = mMinPrec;
        } else {
          roughPrec = p + digitsNeeded / 2;
        }
        final Z roughAppr = getApprox(roughPrec);
        h = roughAppr.add(Z.ONE).shiftLeft(roughPrec - workingArgPrec);
        l = roughAppr.subtract(Z.ONE).shiftLeft(roughPrec - workingArgPrec);
        if (h.compareTo(highAppr) > 0)  {
          h = highAppr;
          fHi = mMono.mFuncHigh.getApprox(workingEvalPrec);
          atRight = true;
        } else {
          fHi = fn.execute(CR.valueOf(h).shiftLeft(workingArgPrec)).getApprox(workingEvalPrec);
          atRight = false;
        }
        if (l.compareTo(lowAppr) < 0) {
          l = lowAppr;
          fLo = mMono.mFuncLow.getApprox(workingEvalPrec);
          atLeft = true;
        } else {
          fLo = fn.execute(CR.valueOf(l).shiftLeft(workingArgPrec)).getApprox(workingEvalPrec);
          atLeft = false;
        }
      }
      Z difference = h.subtract(l);
      while (true) {
        if (Thread.interrupted() || sPleaseStop) {
          throw new AbortedError();
        }
        if (difference.compareTo(Z.SIX) < 0) {
          // Answer is less than 1/2 ulp away from h.
          return scale(h, -extraArgPrec);
        }
        final Z fDifference = fHi.subtract(fLo);
        // Narrow the interval by dividing at a cleverly chosen point (guess) in the middle.
        Z guess;
        if (smallSteps >= 2 || fDifference.signum() == 0) {
          // Do a binary search step to guarantee linear convergence.
          guess = l.add(h).divide2();
        } else {
          // interpolate.
          // fDifference is nonzero here.
          final Z argDifference = argAppr.subtract(fLo);
          final Z t = argDifference.multiply(difference);
          Z adj = t.divide(fDifference);
          if (adj.compareTo(difference.shiftRight(2)) < 0) {
            // Very close to left side of interval; move closer to center.
            // If one of the endpoints is very close to the answer, this slows conversion a bit.
            // But it greatly increases the probability that the answer will be in the smaller
            // subinterval.
            adj = adj.shiftLeft(1);
          } else if (adj.compareTo(difference.multiply(Z.THREE).shiftRight(2)) > 0) {
            adj = difference.subtract(difference.subtract(adj).shiftLeft(1));
          }
          if (adj.signum() <= 0) {
            adj = Z.TWO;
          }
          if (adj.compareTo(difference) >= 0) {
            adj = difference.subtract(Z.TWO);
          }
          guess = adj.signum() <= 0 ? l.add(Z.TWO) : l.add(adj);
        }
        int outcome;
        Z tweak = Z.TWO;
        Z fGuess;
        for (boolean adjPrec = false;; adjPrec = !adjPrec) {
          final CR guesscr = CR.valueOf(guess).shiftLeft(workingArgPrec);
          final CR fGuesscr = fn.execute(guesscr);
          fGuess = fGuesscr.getApprox(workingEvalPrec);
          outcome = sloppyCompare(fGuess, argAppr);
          if (outcome != 0) {
            break;
          }
          // Alternately increase evaluation precision and adjust guess slightly.
          // This should be an unlikely case.
          if (adjPrec) {
            // adjust working_eval_prec to get enough resolution.
            final int adjustment = mMono.mDerivMsd > 0 ? -20 : mMono.mDerivMsd - 20;
            final CR lcr = CR.valueOf(l).shiftLeft(workingArgPrec);
            final CR hcr = CR.valueOf(h).shiftLeft(workingArgPrec);
            workingEvalPrec += adjustment;
            if (atLeft) {
              fLo = mMono.mFuncLow.getApprox(workingEvalPrec);
            } else {
              fLo = fn.execute(lcr).getApprox(workingEvalPrec);
            }
            if (atRight) {
              fHi = mMono.mFuncHigh.getApprox(workingEvalPrec);
            } else {
              fHi = fn.execute(hcr).getApprox(workingEvalPrec);
            }
            argAppr = mArg.getApprox(workingEvalPrec);
          } else {
            // guess might be exactly right; tweak it slightly.
            final Z newGuess = guess.add(tweak);
            if (newGuess.compareTo(h) >= 0) {
              guess = guess.subtract(tweak);
            } else {
              guess = newGuess;
            }
            // If we keep hitting the right answer, it's
            // important to alternate which side we move it
            // to, so that the interval shrinks rapidly.
            tweak = tweak.negate();
          }
        }
        if (outcome > 0) {
          h = guess;
          fHi = fGuess;
          atRight = false;
        } else {
          l = guess;
          fLo = fGuess;
          atLeft = false;
        }
        final Z newDifference = h.subtract(l);
        if (newDifference.compareTo(difference.divide2()) >= 0) {
          ++smallSteps;
        } else {
          smallSteps = 0;
        }
        difference = newDifference;
      }
    }
  }
  
  @Override
  public CR execute(final CR x) {
    return new InverseIncreasingCR(this, x);
  }
}
