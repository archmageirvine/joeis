package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099782 Sum C(n-k,2k)2^k*4^(n-3k), <code>k=0..floor(n/3)</code>.
 * @author Sean A. Irvine
 */
public class A099782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099782() {
    super(new long[] {2, -16, 8}, new long[] {1, 4, 16});
  }
}
