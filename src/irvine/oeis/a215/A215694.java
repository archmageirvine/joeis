package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215694 <code>a(n) = 5*a(n-1) - 6*a(n-2) + a(n-3)</code> with <code>a(0)=1, a(1)=2, a(2)=7</code>.
 * @author Sean A. Irvine
 */
public class A215694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215694() {
    super(new long[] {1, -6, 5}, new long[] {1, 2, 7});
  }
}
