package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113655 Reverse blocks of three in the sequence of natural numbers.
 * @author Sean A. Irvine
 */
public class A113655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113655() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 2, 1, 6});
  }
}
