package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100136 a(n) = Sum_{k=0..floor(n/6)} C(n-3k,3k) * 3^k.
 * @author Sean A. Irvine
 */
public class A100136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100136() {
    super(new long[] {3, 0, 0, 1, -3, 3}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
