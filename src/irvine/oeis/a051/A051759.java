package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a019.A019654;

/**
 * A051759 Consider the problem of placing A051756(n) queens on an n X n board so that each queen attacks precisely 3 others. Sequence gives number of solutions up to square symmetry.
 * @author Sean A. Irvine
 */
public class A051759 extends A019654 {

  private int mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(solve(++mN, 3));
  }
}
