package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113801.
 * @author Sean A. Irvine
 */
public class A113801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113801() {
    super(new long[] {-1, 1, 1}, new long[] {1, 13, 15});
  }
}
