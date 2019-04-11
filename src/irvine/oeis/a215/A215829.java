package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215829 <code>a(n) = -3*a(n-1) + 9*a(n-2) + 3*a(n-3),</code> with <code>a(0)=3, a(1)=-3, a(2)=27</code>.
 * @author Sean A. Irvine
 */
public class A215829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215829() {
    super(new long[] {3, 9, -3}, new long[] {3, -3, 27});
  }
}
