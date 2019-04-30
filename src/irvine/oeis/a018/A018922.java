package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018922 Define the generalized Pisot sequence <code>T(a(0),a(1))</code> by: <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code>. This is <code>T(8,16)</code>.
 * @author Sean A. Irvine
 */
public class A018922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018922() {
    super(new long[] {-1, 0, 0, 0, 2}, new long[] {8, 16, 31, 60, 116});
  }
}
