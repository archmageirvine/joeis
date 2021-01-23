package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036837 Schoenheim bound L_1(n,n-5,n-6).
 * @author Sean A. Irvine
 */
public class A036837 extends A036831 {

  private long mN = 6;

  @Override
  public Z next() {
    return l(++mN, mN - 5, mN - 6, 1);
  }
}
