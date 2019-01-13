package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041083.
 * @author Sean A. Irvine
 */
public class A041083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041083() {
    super(new long[] {-1, 0, 14, 0}, new long[] {1, 1, 13, 14});
  }
}
