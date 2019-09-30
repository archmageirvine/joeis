package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097175 <code>a(n) = Sum_{k=0..n} binomial(floor((n+1)/2), floor((k+1)/2)) * 4^k</code>.
 * @author Sean A. Irvine
 */
public class A097175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097175() {
    super(new long[] {272, -272, -33, 33, 1}, new long[] {1, 5, 21, 105, 361});
  }
}
