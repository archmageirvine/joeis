package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018916 Define the sequence T(a(0),a(1)) by a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n) for n &gt;= 0. This is T(2,8).
 * @author Sean A. Irvine
 */
public class A018916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018916() {
    super(new long[] {-2, 0, 4}, new long[] {2, 8, 31});
  }
}
