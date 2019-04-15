package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018919 Define the generalized Pisot sequence <code>T(a(0),a(1))</code> by: <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n).</code> This is <code>T(3,9)</code>.
 * @author Sean A. Irvine
 */
public class A018919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018919() {
    super(new long[] {-1, 0, 3}, new long[] {3, 9, 26});
  }
}
