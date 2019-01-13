package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294052.
 * @author Sean A. Irvine
 */
public class A294052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294052() {
    super(new long[] {1, -5, 5, 8, -15, 7}, new long[] {2, 13, 61, 248, 935, 3368});
  }
}
