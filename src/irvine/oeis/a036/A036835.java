package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036835 Schoenheim bound L_1(n,8,7).
 * @author Sean A. Irvine
 */
public class A036835 extends A036831 {

  private long mN = 7;

  @Override
  public Z next() {
    return l(++mN, 8, 7, 1);
  }
}
