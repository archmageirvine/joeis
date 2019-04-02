package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215492 a(n) = 21*a(n-2) + 7*a(n-3), with a(0)=0, a(1)=3, and a(2)=6.
 * @author Sean A. Irvine
 */
public class A215492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215492() {
    super(new long[] {7, 21, 0}, new long[] {0, 3, 6});
  }
}
