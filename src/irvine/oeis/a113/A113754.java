package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113754.
 * @author Sean A. Irvine
 */
public class A113754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113754() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 30, 285, 1496, 5525, 16206, 40425});
  }
}
