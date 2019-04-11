package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090386 Fifth diagonal (m=4) of triangle A084938; <code>a(n) =</code> A084938(n+4,n) <code>= (n^4 + 18*n^3 + 131*n^2 + 426*n)/24</code>.
 * @author Sean A. Irvine
 */
public class A090386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090386() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 24, 64, 126, 217});
  }
}
