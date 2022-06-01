package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241200 For the n in A241199, the index of the first of 4 terms in binomial(n,k) that satisfy a quadratic relation.
 * @author Sean A. Irvine
 */
public class A241200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241200() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 4, 9, 12, 19});
  }
}
