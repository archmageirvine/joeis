package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018919 Define the generalized Pisot sequence T(a(0),a(1)) by: a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n). This is T(3,9).
 * @author Sean A. Irvine
 */
public class A018919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018919() {
    super(new long[] {-1, 0, 3}, new long[] {3, 9, 26});
  }
}
