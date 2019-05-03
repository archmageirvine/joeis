package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241200 For the n in <code>A241199</code>, the index of the first of 4 terms in <code>binomial(n,k)</code> that satisfy a quadratic relation.
 * @author Sean A. Irvine
 */
public class A241200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241200() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 4, 9, 12, 19});
  }
}
