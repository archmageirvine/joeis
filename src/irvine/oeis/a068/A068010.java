package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068010 Number of subsets of <code>{1,2,3,</code>...,n} that sum to <code>0 mod 3</code>.
 * @author Sean A. Irvine
 */
public class A068010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068010() {
    super(new long[] {-4, 2, 0, 2}, new long[] {1, 1, 2, 4});
  }
}
