package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215493 <code>a(n) = 7*a(n-1) - 14*a(n-2) + 7*a(n-3)</code> with <code>a(0)=0, a(1)=1, a(2)=4</code>.
 * @author Sean A. Irvine
 */
public class A215493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215493() {
    super(new long[] {7, -14, 7}, new long[] {0, 1, 4});
  }
}
