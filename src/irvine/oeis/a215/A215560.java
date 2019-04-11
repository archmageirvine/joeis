package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215560 <code>a(n) = 3*a(n-1) + 46*a(n-2) + a(n-3)</code> with <code>a(0)=a(1)=3, a(2)=101</code>.
 * @author Sean A. Irvine
 */
public class A215560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215560() {
    super(new long[] {1, 46, 3}, new long[] {3, 3, 101});
  }
}
