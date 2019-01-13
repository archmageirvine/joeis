package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294259.
 * @author Sean A. Irvine
 */
public class A294259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294259() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 4, 15, 43});
  }
}
