package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215695 <code>a(n) = 5*a(n-1) - 6*a(n-2) + a(n-3)</code> with <code>a(0)=1, a(1)=0, a(2)=-2</code>.
 * @author Sean A. Irvine
 */
public class A215695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215695() {
    super(new long[] {1, -6, 5}, new long[] {1, 0, -2});
  }
}
