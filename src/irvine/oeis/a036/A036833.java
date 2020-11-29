package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036833 Schoenheim bound L_1(n,6,5).
 * @author Sean A. Irvine
 */
public class A036833 extends A036831 {

  private long mN = 5;

  @Override
  public Z next() {
    return l(++mN, 6, 5, 1);
  }
}
