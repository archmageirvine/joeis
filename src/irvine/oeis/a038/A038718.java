package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038718 Number of permutations P of {1,2,...,n} such that P(1)=1 and |P^-1(i+1)-P^-1(i)| equals 1 or 2 for i=1,2,...,n-1.
 * @author Sean A. Irvine
 */
public class A038718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038718() {
    super(new long[] {-1, 1, -1, 2}, new long[] {1, 1, 2, 4});
  }
}
