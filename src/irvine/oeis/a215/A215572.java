package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215572 <code>a(n) = 3*a(n-1) + 46*a(n-2) + a(n-3)</code> with <code>a(0)=2, a(1)=5, a(2)=106</code>.
 * @author Sean A. Irvine
 */
public class A215572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215572() {
    super(new long[] {1, 46, 3}, new long[] {2, 5, 106});
  }
}
