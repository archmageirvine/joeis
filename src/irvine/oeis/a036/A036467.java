package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A036467 a(n) + a(n-1) = n-th prime.
 * @author Sean A. Irvine
 */
public class A036467 extends A000040 {

  {
    setOffset(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : super.next().subtract(mA);
    return mA;
  }
}
