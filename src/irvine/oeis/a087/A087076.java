package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087076 Sums of the squares of the elements in the subsets of the integers 1 to n.
 * @author Sean A. Irvine
 */
public class A087076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087076() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 1, 10, 56});
  }
}
