package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099625 a(n) = Sum_{k=0..floor(n/2)} C(n-k,k+2)*2^(n-k-2)*(1/2)^k.
 * @author Sean A. Irvine
 */
public class A099625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099625() {
    super(new long[] {4, 4, -11, 6}, new long[] {0, 0, 1, 6});
  }
}
