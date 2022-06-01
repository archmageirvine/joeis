package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215666 a(n) = 3*a(n-2) - a(n-3), with a(0)=0, a(1)=-3, and a(2)=6.
 * @author Sean A. Irvine
 */
public class A215666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215666() {
    super(new long[] {-1, 3, 0}, new long[] {0, -3, 6});
  }
}
