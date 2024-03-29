package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061024 a(n) = (prime(n)!)^2.
 * @author Sean A. Irvine
 */
public class A061024 extends A000040 {

  private Z mF2 = Z.ONE;
  private long mM = 2;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    while (mM <= p) {
      mF2 = mF2.multiply(mM * mM);
      ++mM;
    }
    return mF2;
  }
}
