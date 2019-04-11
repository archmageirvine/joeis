package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215575 <code>a(n) = 7*(a(n-1) - a(n-2) - a(n-3)),</code> with <code>a(0)=3, a(1)=7, a(2)=35</code>.
 * @author Sean A. Irvine
 */
public class A215575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215575() {
    super(new long[] {-7, -7, 7}, new long[] {3, 7, 35});
  }
}
