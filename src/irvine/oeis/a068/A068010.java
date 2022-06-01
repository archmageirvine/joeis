package irvine.oeis.a068;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A068010 Number of subsets of {1,2,3,...,n} that sum to 0 mod 3.
 * @author Sean A. Irvine
 */
public class A068010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068010() {
    super(new long[] {-4, 2, 0, 2}, new long[] {1, 1, 2, 4});
  }
}
