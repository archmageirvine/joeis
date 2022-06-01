package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215569 a(n) = 3*a(n-1) + 46*a(n-2) + a(n-3) with a(0)=0, a(1)=14, a(2)=49.
 * @author Sean A. Irvine
 */
public class A215569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215569() {
    super(new long[] {1, 46, 3}, new long[] {0, 14, 49});
  }
}
