package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113444.
 * @author Sean A. Irvine
 */
public class A113444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113444() {
    super(new long[] {-1, 2, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2});
  }
}
