package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099785 <code>a(n) = Sum_{k=0..floor(n/4)} C(n-k,3*k) * 2^(n-3*k)</code>.
 * @author Sean A. Irvine
 */
public class A099785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099785() {
    super(new long[] {2, 8, -12, 6}, new long[] {1, 2, 4, 8});
  }
}
