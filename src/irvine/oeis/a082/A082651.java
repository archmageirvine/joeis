package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082651 Positive integer values of n such that <code>5n^2+11</code> is a square.
 * @author Sean A. Irvine
 */
public class A082651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082651() {
    super(new long[] {-1, 0, 18, 0}, new long[] {1, 7, 25, 127});
  }
}
