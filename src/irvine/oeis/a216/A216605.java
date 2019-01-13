package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216605.
 * @author Sean A. Irvine
 */
public class A216605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216605() {
    super(new long[] {1, -3, -6, 4, 5, -1}, new long[] {6, -1, 11, -4, 31, -16});
  }
}
