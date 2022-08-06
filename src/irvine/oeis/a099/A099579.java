package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099579 a(n) = Sum_{k=0..floor(n/2)} binomial(n-k, k-1) * 3^(k-1).
 * @author Sean A. Irvine
 */
public class A099579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099579() {
    super(new long[] {-9, -3, 6, 1}, new long[] {0, 0, 1, 1});
  }
}
