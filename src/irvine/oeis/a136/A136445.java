package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136445 Size of the BDD for the hidden weighted bit function, with the variables in their natural ordering.
 * @author Sean A. Irvine
 */
public class A136445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136445() {
    super(new long[] {-1, 0, 2, 2, -2, -3, 0, 2, 1}, new long[] {3, 3, 7, 10, 17, 25, 40, 57, 85});
  }
}
