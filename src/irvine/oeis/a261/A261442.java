package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261442.
 * @author Sean A. Irvine
 */
public class A261442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261442() {
    super(new long[] {1, -1, -2, 2, -1, 4, -2, -4, 4}, new long[] {0, 2, 6, 15, 32, 64, 120, 218, 385});
  }
}
