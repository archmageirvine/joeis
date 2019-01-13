package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062112.
 * @author Sean A. Irvine
 */
public class A062112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062112() {
    super(new long[] {-2, 0, 4, 0}, new long[] {0, 1, 1, 2});
  }
}
