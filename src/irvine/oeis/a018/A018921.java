package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018921 Define the generalized Pisot sequence <code>T(a(0),a(1))</code> by: <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code>. This is <code>T(4,8)</code>.
 * @author Sean A. Irvine
 */
public class A018921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018921() {
    super(new long[] {-1, 0, 0, 2}, new long[] {4, 8, 15, 28});
  }
}
