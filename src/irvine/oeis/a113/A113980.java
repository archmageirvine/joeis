package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113980.
 * @author Sean A. Irvine
 */
public class A113980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113980() {
    super(new long[] {-4, 2, 2}, new long[] {1, 0, 3});
  }
}
