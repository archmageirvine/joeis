package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294286.
 * @author Sean A. Irvine
 */
public class A294286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294286() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 5, 10, 30, 46, 91});
  }
}
