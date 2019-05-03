package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A000173 Unitary-sociable numbers (smallest member of each <code>cycle)</code>.
 * @author Sean A. Irvine
 */
public class A000173 implements Sequence {

  private long mN = 0;
  private final Cheetah mFactor = new Cheetah();
  private final HashSet<Z> mAlreadyReported = new HashSet<>();
  {
    mAlreadyReported.add(Z.ZERO);
  }

  private Z unitaryDivisorSum(final Z n) {
    final FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.UNKNOWN, 1);
    mFactor.factor(fs);
    return fs.unitaryDivisorSum();
    /*
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    // Construct a nasty factor sequence where we claim all the unitary
    // prime powers in fs are actually prime.  This isn't true of course
    // but makes the sigma function do the right thing for computing the
    // sum of all unitary divisors.
    final FactorSequence flatten = new FactorSequence();
    Z t = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z unitary = p.pow(e);
      flatten.add(unitary, FactorSequence.PRIME);
      t = t.multiply(unitary);
    }
    if (n.equals(t)) {
      return flatten.sigma().subtract(n);
    } else {
      return flatten.sigma();
    }
    */
  }


  @Override
  public Z next() {
    while (true) {
      Z n = Z.valueOf(++mN);
      //System.out.println("mN=" + mN);
      final Z m = n;
      final HashSet<Z> seen = new HashSet<>();
      while (true) {
        seen.add(n);
        n = unitaryDivisorSum(n);
        if (mAlreadyReported.contains(n)) {
          break;
        }
        if (seen.contains(n)) {
          if (seen.size() > 2 && m.equals(n)) {
            mAlreadyReported.addAll(seen);
            return m;
          } else {
            break;
          }
        }
      }
    }
  }
}
