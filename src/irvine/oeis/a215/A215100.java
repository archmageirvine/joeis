package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215100 a(n) = 3*a(n-1) + 4*a(n-2) + a(n-3) with a(0)=2, a(1)=5, a(2)=22.
 * @author Sean A. Irvine
 */
public class A215100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215100() {
    super(new long[] {1, 4, 3}, new long[] {2, 5, 22});
  }
}
