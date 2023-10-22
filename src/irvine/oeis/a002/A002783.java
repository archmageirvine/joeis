package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002783 a(n) = 2*(3^n - 2^n) + 1.
 * @author Sean A. Irvine
 */
public class A002783 extends Sequence0 {

  private Z mTwos = Z.ONE;
  private Z mThrees = Z.ONE;

  @Override
  public Z next() {
    final Z r = mThrees.subtract(mTwos).multiply2().add(1);
    mTwos = mTwos.multiply2();
    mThrees = mThrees.multiply(3);
    return r;
  }
}
