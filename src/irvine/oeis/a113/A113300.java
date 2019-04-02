package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113300 Sum of even-indexed terms of tribonacci numbers.
 * @author Sean A. Irvine
 */
public class A113300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113300() {
    super(new long[] {1, 1, 3}, new long[] {0, 1, 3});
  }
}
