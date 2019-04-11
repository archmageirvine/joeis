package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099780 <code>a(n) =</code> Sum_{k=0..floor(n/3)} C(n-k, <code>2*k) * 2^k*3^(n-3*k)</code>.
 * @author Sean A. Irvine
 */
public class A099780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099780() {
    super(new long[] {2, -9, 6}, new long[] {1, 3, 9});
  }
}
