package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221366 The simple continued fraction expansion of F(x) := Product_{n &gt;= 0} (1 - x^(4*n+3))/(1 - x^(4*n+1)) when x = (1/2)*(7 - 3*sqrt(5)).
 * @author Sean A. Irvine
 */
public class A221366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221366() {
    super(new long[] {1, 0, -8, 0, 8, 0}, new long[] {1, 5, 1, 45, 1, 320});
  }
}
