package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022565.
 * @author Sean A. Irvine
 */
public class A022565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022565() {
    super(new long[] {-400, 570, -193, 24}, new long[] {1, 24, 383, 5130});
  }
}
