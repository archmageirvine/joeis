package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221193 Simple continued fraction expansion of product {k &gt;= 0} (1 - 2*(N - sqrt(N^2-1))^(4*k+3))/(1 - 2*(N - sqrt(N^2-1))^(4*k+1)) at N = 3.
 * @author Sean A. Irvine
 */
public class A221193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221193() {
    super(new long[] {1, 0, -1, 0, -34, 0, 34, 0, 1, 0}, new long[] {1, 1, 1, 32, 1, 97, 1, 1152, 1, 3361});
  }
}
