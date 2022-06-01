package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053494 Number of symmetric 5 X 5 matrices of nonnegative integers with every row and column adding to n.
 * @author Sean A. Irvine
 */
public class A053494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053494() {
    super(new long[] {1, -5, 4, 20, -40, -16, 100, -44, -110, 110, 44, -100, 16, 40, -20, -4, 5}, new long[] {1, 26, 348, 2698, 14751, 62781, 222190, 681460, 1865715, 4655535, 10756921, 23290026, 47700173, 93104473, 174248451, 314246511, 548380980});
  }
}
