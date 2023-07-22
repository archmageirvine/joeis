package irvine.oeis.a159;
// manually robot/rowsums at 2023-07-20

import irvine.math.z.Z;
import irvine.oeis.a064.A064580;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A159772 Number of n-leaf binary trees that do not contain (()((((()())())())())) as a subtree.
 * Row sums of triangle A064580
 * @author Georg Fischer
 */
public class A159772 extends RowSumSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A159772() {
    super(1, new A064580());
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : super.next();
  }
}
