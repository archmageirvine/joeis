package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226089 Denominators of the series b(n+1) = (b(n)+k)/(1+b(n)*k); where k = 1/(n+1), b(1) = 0.
 * @author Sean A. Irvine
 */
public class A226089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226089() {
    super(1, new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {1, 2, 7, 11, 8, 11, 29, 37, 23});
  }
}
