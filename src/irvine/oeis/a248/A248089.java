package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248089 a(n) = Sum_{k=0..floor(n/4)} binomial(n-k, 3k)*(-3)^(3k)*4^(n-4k).
 * @author Sean A. Irvine
 */
public class A248089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248089() {
    super(new long[] {-27, 64, -48, 12}, new long[] {1, 4, 16, 64});
  }
}
