package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a019.A019654;

/**
 * A051758 Consider problem of placing A051755(n) queens on an n X n board so that each queen attacks precisely 2 others. Sequence gives number of solutions up to square symmetry.
 * @author Sean A. Irvine
 */
public class A051758 extends A019654 {

  private int mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(solve(++mN, 2));
  }
}
