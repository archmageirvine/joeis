package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243133 64*n^7 - 112*n^5 + 56*n^3 - 7*n.
 * @author Sean A. Irvine
 */
public class A243133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243133() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 5042, 114243, 937444, 4656965, 17057046, 50843527});
  }
}
