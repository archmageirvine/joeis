package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099782 a(n) = Sum_{k=0..floor(n/3)} C(n-k,2*k) * 2^k * 4^(n-3*k).
 * @author Sean A. Irvine
 */
public class A099782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099782() {
    super(new long[] {2, -16, 8}, new long[] {1, 4, 16});
  }
}
