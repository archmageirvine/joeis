package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077814 a(n) = #{0&lt;=k&lt;=n: mod(k*n,4)=2}.
 * @author Sean A. Irvine
 */
public class A077814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077814() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 0, 1, 1, 0, 1});
  }
}
