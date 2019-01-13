package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094790.
 * @author Sean A. Irvine
 */
public class A094790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094790() {
    super(new long[] {1, -6, 5}, new long[] {1, 3, 9});
  }
}
