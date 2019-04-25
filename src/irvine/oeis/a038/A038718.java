package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038718 Number of permutations P of <code>{1,2,...,n}</code> such that P(1)=1 and |P^-1(i+1)-P^-1(i)| equals 1 or 2 for <code>i=1,2,...,n-1</code>.
 * @author Sean A. Irvine
 */
public class A038718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038718() {
    super(new long[] {-1, 1, -1, 2}, new long[] {1, 1, 2, 4});
  }
}
