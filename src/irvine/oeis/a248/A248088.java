package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248088 a(n) = Sum_{k=0..floor(n/4)} binomial(n-3k, k)*(-3)^(3k)*4^(n-4k).
 * @author Sean A. Irvine
 */
public class A248088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248088() {
    super(new long[] {-27, 0, 0, 4}, new long[] {1, 4, 16, 64});
  }
}
