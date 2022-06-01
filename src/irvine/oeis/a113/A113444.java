package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113444 a(n) = a(n-1) + Sum_{0&lt;k&lt;=n/5} a(n-5k) with a(0)=1.
 * @author Sean A. Irvine
 */
public class A113444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113444() {
    super(new long[] {-1, 2, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2});
  }
}
