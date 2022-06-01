package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276054 Sum of the asymmetry degrees of all compositions of n with parts in {1,2,4,6,8,10,...}.
 * @author Sean A. Irvine
 */
public class A276054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276054() {
    super(new long[] {1, -4, 2, 5, 0, -1, -3, -5, -1, 4, 1}, new long[] {0, 0, 0, 2, 2, 8, 16, 34, 72, 146, 294});
  }
}
