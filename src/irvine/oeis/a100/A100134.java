package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100134 <code>a(n) =</code> Sum_{k=0..floor(n/6)} <code>binomial(n-3k, 3k)</code>.
 * @author Sean A. Irvine
 */
public class A100134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100134() {
    super(new long[] {1, 0, 0, 1, -3, 3}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
