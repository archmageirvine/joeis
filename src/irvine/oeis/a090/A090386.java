package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090386 Fifth diagonal <code>(m=4)</code> of triangle <code>A084938; a(n) = A084938(n+4,n) = (n^4 + 18*n^3 + 131*n^2 + 426*n)/24</code>.
 * @author Sean A. Irvine
 */
public class A090386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090386() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 24, 64, 126, 217});
  }
}
