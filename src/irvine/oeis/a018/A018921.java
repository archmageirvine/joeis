package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018921 Define the generalized Pisot sequence T(a(0),a(1)) by: a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n). This is T(4,8).
 * @author Sean A. Irvine
 */
public class A018921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018921() {
    super(new long[] {-1, 0, 0, 2}, new long[] {4, 8, 15, 28});
  }
}
