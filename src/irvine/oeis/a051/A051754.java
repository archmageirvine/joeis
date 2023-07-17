package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a019.A019654;

/**
 * A051754 Consider problem of placing N queens on an n X n board so that each queen attacks precisely 1 other. Sequence gives maximal number of queens.
 * @author Sean A. Irvine
 */
public class A051754 extends A019654 {

  /** Construct the sequence. */
  public A051754() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    solve(++mN, 1);
    return Z.valueOf(mMaximalQueens);
  }
}
