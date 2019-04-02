package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137213 First differences of A137212.
 * @author Sean A. Irvine
 */
public class A137213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137213() {
    super(new long[] {-3, -5, 5}, new long[] {0, 1, 4});
  }
}
