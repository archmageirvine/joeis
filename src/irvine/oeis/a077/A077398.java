package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077398 First member of the Diophantine pair <code>(m,k)</code> that satisfies <code>7*(m^2+m) = k^2+k; a(n)=m</code>.
 * @author Sean A. Irvine
 */
public class A077398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077398() {
    super(new long[] {1, -1, -16, 16, 1}, new long[] {0, 2, 5, 39, 87});
  }
}
