package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079496 <code>a(0) = a(1) = 1;</code> thereafter <code>a(2*n+1) = 2*a(2*n) - a(2*n-1), a(2*n) = 4*a(2*n-1) - a(2*n-2)</code>.
 * @author Sean A. Irvine
 */
public class A079496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079496() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 1, 3, 5});
  }
}
