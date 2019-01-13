package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212503.
 * @author Sean A. Irvine
 */
public class A212503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212503() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 9, 49, 144, 361, 729, 1369});
  }
}
