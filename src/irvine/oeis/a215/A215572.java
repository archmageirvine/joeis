package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215572 a(n) = 3*a(n-1) + 46*a(n-2) + a(n-3) with a(0)=2, a(1)=5, a(2)=106.
 * @author Sean A. Irvine
 */
public class A215572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215572() {
    super(new long[] {1, 46, 3}, new long[] {2, 5, 106});
  }
}
