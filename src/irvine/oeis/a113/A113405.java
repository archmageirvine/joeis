package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113405.
 * @author Sean A. Irvine
 */
public class A113405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113405() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, 0, 0, 1});
  }
}
