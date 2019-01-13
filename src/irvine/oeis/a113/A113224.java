package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113224.
 * @author Sean A. Irvine
 */
public class A113224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113224() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 2, 7, 16});
  }
}
