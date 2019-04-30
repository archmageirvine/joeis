package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181510 Number of permutations of the multiset <code>{1,1,2,2,3,3,...,n+1,n+1}</code> avoiding the permutation patterns <code>{132, 231</code>, 2134}.
 * @author Sean A. Irvine
 */
public class A181510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181510() {
    super(new long[] {1, -3, 3}, new long[] {6, 18, 34});
  }
}
