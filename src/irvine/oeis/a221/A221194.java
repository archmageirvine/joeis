package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221194 Simple continued fraction expansion of product {k &gt;= 0} (1 - 2*(N - sqrt(N^2-1))^(4*k+3))/(1 - 2*(N - sqrt(N^2-1))^(4*k+1)) at N = 4.
 * @author Sean A. Irvine
 */
public class A221194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221194() {
    super(new long[] {1, 0, -1, 0, -62, 0, 62, 0, 1, 0}, new long[] {1, 2, 1, 60, 1, 242, 1, 3840, 1, 15122});
  }
}
