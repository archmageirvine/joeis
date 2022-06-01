package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215098 a(0)=0, a(1)=1, a(n) = n*(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A215098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215098() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 1, 2, 5, 10});
  }
}
