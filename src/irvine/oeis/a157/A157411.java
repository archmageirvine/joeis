package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157411 <code>a(n) = 30*n^4 - 120*n^3 + 120*n^2 - 19</code>.
 * @author Sean A. Irvine
 */
public class A157411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157411() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-19, 11, -19, 251, 1901});
  }
}
