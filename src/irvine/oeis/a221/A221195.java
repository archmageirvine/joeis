package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221195 Simple continued fraction expansion of product {k &gt;= 0} (1 - 2*(N - sqrt(N^2-1))^(4*k+3))/(1 - 2*(N - sqrt(N^2-1))^(4*k+1)) at N = 5.
 * @author Sean A. Irvine
 */
public class A221195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221195() {
    super(new long[] {1, 0, -1, 0, -98, 0, 98, 0, 1, 0}, new long[] {1, 3, 1, 96, 1, 483, 1, 9600, 1, 47523});
  }
}
