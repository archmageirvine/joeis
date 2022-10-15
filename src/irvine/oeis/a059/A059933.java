package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a056.A056193;

/**
 * A059933 Goodstein sequence starting with 16: to calculate a(n+1), write a(n) in the hereditary representation in base n+2, then bump the base to n+3, then subtract 1.
 * @author Sean A. Irvine
 */
public class A059933 extends A056193 {

  private long mN = 1;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : code(mA, ++mN).subtract(1);
    return mA;
  }
}
