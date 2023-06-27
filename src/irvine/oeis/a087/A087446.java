package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087446 Numbers that are congruent to {1, 6} mod 15.
 * @author Sean A. Irvine
 */
public class A087446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087446() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 6, 16});
  }
}
