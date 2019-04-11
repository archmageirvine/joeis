package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215664 <code>a(n) = 3*a(n-2) - a(n-3),</code> with <code>a(0)=3, a(1)=0,</code> and <code>a(2)=6</code>.
 * @author Sean A. Irvine
 */
public class A215664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215664() {
    super(new long[] {-1, 3, 0}, new long[] {3, 0, 6});
  }
}
