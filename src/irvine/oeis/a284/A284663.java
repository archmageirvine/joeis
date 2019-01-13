package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284663.
 * @author Sean A. Irvine
 */
public class A284663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284663() {
    super(new long[] {-1, -1, 1, 1, 5, 1, 3}, new long[] {3, 15, 51, 179, 663, 2439, 8935});
  }
}
