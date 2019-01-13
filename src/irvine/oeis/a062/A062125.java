package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062125.
 * @author Sean A. Irvine
 */
public class A062125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062125() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 56, 263, 815, 1982});
  }
}
