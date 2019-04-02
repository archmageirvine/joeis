package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244868 Number of symmetric 5 X 5 matrices of nonnegative integers with zeros on the main diagonal and every row and column adding to n.
 * @author Sean A. Irvine
 */
public class A244868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244868() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 22, 158, 654, 1980, 4906});
  }
}
