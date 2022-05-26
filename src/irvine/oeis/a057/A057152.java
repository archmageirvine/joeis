package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057152 Limiting number of m X m binary matrices with m+n ones, with no zero rows or columns, up to row and column permutations, as m tends to infinity.
 * @author Sean A. Irvine
 */
public class A057152 extends A057149 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : t(3 * mN, 4 * mN);
  }
}
