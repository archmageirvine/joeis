package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a019.A019654;

/**
 * A051757 Consider problem of placing A051754(n) queens on an n X n board so that each queen attacks precisely 1 other. Sequence gives number of solutions up to square symmetry.
 * @author Sean A. Irvine
 */
public class A051757 extends A019654 {

  /** Construct the sequence. */
  public A051757() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(solve(++mN, 1));
  }
}
