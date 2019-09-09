package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099781 <code>a(n) = Sum_{k=0..floor(n/3)} C(n-k,2*k) * 4^(n-3*k)</code>.
 * @author Sean A. Irvine
 */
public class A099781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099781() {
    super(new long[] {1, -16, 8}, new long[] {1, 4, 16});
  }
}
