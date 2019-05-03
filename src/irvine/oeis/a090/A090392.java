package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090392 Seventh diagonal <code>(m=6)</code> of triangle <code>A084938; a(n) = A084938(n+6,n) = (n^6 + 45*n^5 + 925*n^4 + 11475*n^3 + 92314*n^2 + 413640*n)/720</code>.
 * @author Sean A. Irvine
 */
public class A090392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090392() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 720, 1812, 3428, 5768, 9090, 13721});
  }
}
