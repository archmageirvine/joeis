package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215492 <code>a(n) = 21*a(n-2) + 7*a(n-3)</code>, with <code>a(0)=0, a(1)=3</code>, and <code>a(2)=6</code>.
 * @author Sean A. Irvine
 */
public class A215492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215492() {
    super(new long[] {7, 21, 0}, new long[] {0, 3, 6});
  }
}
