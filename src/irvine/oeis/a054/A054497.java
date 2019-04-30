package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054497 Number of symmetric nonnegative integer 7 X 7 matrices with sum of elements equal to <code>4*n</code>, under action of dihedral group D_4.
 * @author Sean A. Irvine
 */
public class A054497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054497() {
    super(new long[] {-1, 7, -18, 14, 25, -63, 36, 36, -63, 25, 14, -18, 7}, new long[] {1, 7, 31, 105, 300, 756, 1732, 3676, 7330, 13870, 25102, 43714, 73612});
  }
}
