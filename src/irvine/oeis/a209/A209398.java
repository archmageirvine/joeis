package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209398 Number of subsets of <code>{1,</code>...,n} containing two elements whose difference is 2.
 * @author Sean A. Irvine
 */
public class A209398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209398() {
    super(new long[] {-2, -1, 1, -2, 3}, new long[] {0, 0, 0, 2, 7});
  }
}
