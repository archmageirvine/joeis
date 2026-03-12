package irvine.oeis.a002;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.DirectPredicate;
import irvine.oeis.Sequence1;

/**
 * A002191 Possible values for sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A002191 extends Sequence1 implements DirectPredicate {

  private Z mSigma = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSigma = mSigma.add(1);
      if (!InverseSigma.countInverseSigma(mSigma).isZero()) {
        return mSigma;
      }
    }
  }

  @Override
  public boolean is(final Z n) {
    if (n.isZero()) {
      return false;
    }
    return !InverseSigma.countInverseSigma(n).isZero();
  }

  @Override
  public boolean is(final long n) {
    if (n == 0L) {
      return false;
    }
    return !InverseSigma.countInverseSigma(Z.valueOf(n)).isZero();
  }

}
