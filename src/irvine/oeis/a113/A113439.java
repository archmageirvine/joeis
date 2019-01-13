package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113439.
 * @author Sean A. Irvine
 */
public class A113439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113439() {
    super(new long[] {-1, 2, 0, 0, 1}, new long[] {1, 1, 1, 1, 2});
  }
}
