package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215404 <code>a(n) = 4*a(n-1) - 3*a(n-2) - a(n-3)</code>, with <code>a(0)=0, a(1)=0</code> and <code>a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A215404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215404() {
    super(new long[] {-1, -3, 4}, new long[] {0, 0, 1});
  }
}
