package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Derivative of a monotonic function.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class MonotoneDerivative extends UnaryCRFunction {

  final UnaryCRFunction mFunc;
  // Monotone increasing.
  // If it was monotone decreasing, we negate it.
  final CR mLow; // endpoints and mispoint of interval
  final CR mMid;
  final CR mHigh;
  final CR mFuncLow; // Corresponding function values.
  final CR mFuncMid;
  final CR mFuncHigh;
  final int mDifferenceMsd;  // msd of interval len.

  // Rough approx. of msd of second derivative.
  // This is increased to be an appr. bound on the msd of |(f'(y)-f'(x))/(x-y)|
  // for any pair of points x and y we have considered.
  // It may be better to keep a copy per derivative value.
  final int[] mDeriv2Msd;

  MonotoneDerivative(final UnaryCRFunction func, final CR l, final CR h) {
    mFunc = func;
    mLow = l;
    mHigh = h;
    mMid = l.add(h).shiftRight(1);
    mFuncLow = func.execute(l);
    mFuncMid = func.execute(mMid);
    mFuncHigh = func.execute(h);
    final CR difference = h.subtract(l);
    // compute approximate msd of
    // ((fHigh - fMid) - (fMid - fLow))/(high - low)
    // This should be a very rough appr to the second derivative.
    // We add a little slop to err on the high side, since
    // a low estimate will cause extra iterations.
    final CR apprDiff2 = mFuncHigh.subtract(mFuncMid.shiftLeft(1)).add(mFuncLow);
    mDifferenceMsd = difference.msd();
    mDeriv2Msd = new int[] {apprDiff2.msd() - mDifferenceMsd + 4};
  }

  private static final class MonotoneDerivativeCR extends CR {
    
    private final CR mArg;
    private final CR mFuncArg;
    private final int mMaxDeltaMsd;
    private final MonotoneDerivative mMono;
    
    MonotoneDerivativeCR(final MonotoneDerivative mono, final CR x) {
      mMono = mono;
      mArg = x;
      mFuncArg = mMono.mFunc.execute(x);
      // The following must converge, since arg must be in the open interval.
      final CR leftDiff = mArg.subtract(mMono.mLow);
      final int maxDeltaLeftMsd = leftDiff.msd();
      final CR rightDiff = mMono.mHigh.subtract(mArg);
      final int maxDeltaRightMsd = rightDiff.msd();
      if (leftDiff.signum() < 0 || rightDiff.signum() < 0) {
        throw new ArithmeticException();
      }
      mMaxDeltaMsd = maxDeltaLeftMsd < maxDeltaRightMsd ? maxDeltaLeftMsd : maxDeltaRightMsd;
    }
    
    @Override
    protected Z approximate(final int p) {
      final int extraPrec = 4;
      int logDelta = p - mMono.mDeriv2Msd[0];
      // Ensure that we stay within the interval.
      if (logDelta > mMaxDeltaMsd) {
        logDelta = mMaxDeltaMsd;
      }
      logDelta -= extraPrec;
      final CR delta = ONE.shiftLeft(logDelta);
     
      final CR left = mArg.subtract(delta);
      final CR right = mArg.add(delta);
      final CR fLeft = mMono.mFunc.execute(left);
      final CR fRight = mMono.mFunc.execute(right);
      final CR leftDeriv = mFuncArg.subtract(fLeft).shiftRight(logDelta);
      final CR rightDeriv = fRight.subtract(mFuncArg).shiftRight(logDelta);
      final int evalPrec = p - extraPrec;
      final Z apprLeftDeriv = leftDeriv.getApprox(evalPrec);
      final Z apprRightDeriv = rightDeriv.getApprox(evalPrec);
      final Z derivDifference = apprRightDeriv.subtract(apprLeftDeriv).abs();
      if (derivDifference.compareTo(Z.valueOf(8)) < 0) {
        return scale(apprLeftDeriv, -extraPrec);
      } else {
        if (Thread.interrupted() || sPleaseStop) {
          throw new AbortedError();
        }
        mMono.mDeriv2Msd[0] = evalPrec + derivDifference.bitLength() + 4 /*slop*/;
        mMono.mDeriv2Msd[0] -= logDelta;
        return approximate(p);
      }
    }
  }
  
  @Override
  public CR execute(final CR x) {
    return new MonotoneDerivativeCR(this, x);
  }
}
