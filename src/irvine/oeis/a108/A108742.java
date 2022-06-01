package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108742 Row sums of a triangle related to the Jacobsthal polynomials.
 * @author Sean A. Irvine
 */
public class A108742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108742() {
    super(new long[] {-1, 0, 2, 1}, new long[] {1, 2, 3, 7});
  }
}
