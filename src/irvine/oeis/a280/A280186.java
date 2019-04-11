package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280186 Number of 3-element subsets of S <code>= {1..n}</code> whose sum is odd.
 * @author Sean A. Irvine
 */
public class A280186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280186() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 0, 0, 2, 4});
  }
}
