package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018916 Define the sequence <code>T(a(0),a(1))</code> by <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code> for <code>n &gt;= 0.</code> This is <code>T(2,8)</code>.
 * @author Sean A. Irvine
 */
public class A018916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018916() {
    super(new long[] {-2, 0, 4}, new long[] {2, 8, 31});
  }
}
