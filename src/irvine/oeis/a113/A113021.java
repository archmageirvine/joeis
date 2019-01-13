package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113021.
 * @author Sean A. Irvine
 */
public class A113021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113021() {
    super(new long[] {1, 1, -2, 2}, new long[] {0, 0, 1, 2});
  }
}
