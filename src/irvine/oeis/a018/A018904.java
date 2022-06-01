package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018904 Define the sequence S(a(0),a(1)) by a(n+2) is the least integer such that a(n+2)/a(n+1) &gt; a(n+1)/a(n) for n &gt;= 0. This is S(1,6).
 * @author Sean A. Irvine
 */
public class A018904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018904() {
    super(new long[] {-5, 7}, new long[] {1, 6});
  }
}
