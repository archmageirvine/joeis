package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215664 a(n) = 3*a(n-2) - a(n-3), with a(0)=3, a(1)=0, and a(2)=6.
 * @author Sean A. Irvine
 */
public class A215664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215664() {
    super(new long[] {-1, 3, 0}, new long[] {3, 0, 6});
  }
}
