package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178946 a(n) = n*(n+1)*(2*n+1)/6 - n*floor(n/2).
 * @author Sean A. Irvine
 */
public class A178946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178946() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 3, 11, 22, 45, 73});
  }
}
