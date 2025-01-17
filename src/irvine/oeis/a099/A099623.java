package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099623 a(n) = Sum_{k=0..floor(n/2)} C(n-k,k+2)*2^(n-k-2)*(3/2)^k.
 * @author Sean A. Irvine
 */
public class A099623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099623() {
    super(new long[] {12, -4, -9, 6}, new long[] {0, 0, 1, 6});
  }
}
