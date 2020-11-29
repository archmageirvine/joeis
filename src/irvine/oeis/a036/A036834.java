package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036834 Schoenheim bound L_1(n,7,6).
 * @author Sean A. Irvine
 */
public class A036834 extends A036831 {

  private long mN = 6;

  @Override
  public Z next() {
    return l(++mN, 7, 6, 1);
  }
}
