package irvine.oeis.a002;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A002191 Possible values for sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A002191 extends A000203 {

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
}
