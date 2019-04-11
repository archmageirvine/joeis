package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215665 <code>a(n) = 3*a(n-2) - a(n-3),</code> with <code>a(0)=0, a(1)=a(2)=-3</code>.
 * @author Sean A. Irvine
 */
public class A215665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215665() {
    super(new long[] {-1, 3, 0}, new long[] {0, -3, -3});
  }
}
