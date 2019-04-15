package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094211 <code>a(n) =</code> Sum_{k=0..n} <code>binomial(7*n,7*k)</code>.
 * @author Sean A. Irvine
 */
public class A094211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094211() {
    super(new long[] {-128, -36991, 7585, 71}, new long[] {1, 2, 3434, 232562});
  }
}
