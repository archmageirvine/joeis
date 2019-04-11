package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215510 <code>a(n) = 7*a(n-1) - 14*a(n-2) + 7*a(n-3)</code> with <code>a(0)=0, a(1)=7, a(2)=35</code>.
 * @author Sean A. Irvine
 */
public class A215510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215510() {
    super(new long[] {7, -14, 7}, new long[] {0, 7, 35});
  }
}
