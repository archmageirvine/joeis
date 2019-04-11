package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127868 Number of square tiles in all tilings of <code>a 3</code> X n board with 1 X 1 and L-shaped tiles (where the L-shaped tiles cover 3 squares).
 * @author Sean A. Irvine
 */
public class A127868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127868() {
    super(new long[] {-4, 4, -29, 2, -39, -44, 5, 6}, new long[] {3, 30, 171, 1044, 5691, 30678, 159891, 821100});
  }
}
