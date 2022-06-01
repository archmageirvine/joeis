package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062125 Fifth column of A046741.
 * @author Sean A. Irvine
 */
public class A062125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062125() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 56, 263, 815, 1982});
  }
}
