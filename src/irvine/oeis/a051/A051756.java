package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a019.A019654;

/**
 * A051756 Consider the problem of placing N queens on an n X n board so that each queen attacks precisely 3 others. Sequence gives maximal number of queens.
 * @author Sean A. Irvine
 */
public class A051756 extends A019654 {

  /** Construct the sequence. */
  public A051756() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    solve(++mN, 3);
    return Z.valueOf(mMaximalQueens);
  }
}
