package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021008.
 * @author Sean A. Irvine
 */
public class A021008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021008() {
    super(new long[] {1, 0, -2, 3}, new long[] {5, 11, 24, 52});
  }
}
