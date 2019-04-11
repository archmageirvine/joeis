package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248088 <code>a(n) =</code> Sum_{k=0..floor(n/4)} binomial(n-3k, <code>k)*(-3)^(3k)*4^(n-4k)</code>.
 * @author Sean A. Irvine
 */
public class A248088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248088() {
    super(new long[] {-27, 0, 0, 4}, new long[] {1, 4, 16, 64});
  }
}
