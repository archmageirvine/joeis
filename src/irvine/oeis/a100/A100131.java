package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100131 <code>a(n) = Sum_{k=0..floor(n/4)} binomial(n-2k, 2k)*2^(n-4k)</code>.
 * @author Sean A. Irvine
 */
public class A100131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100131() {
    super(new long[] {1, 0, -4, 4}, new long[] {1, 2, 4, 8});
  }
}
