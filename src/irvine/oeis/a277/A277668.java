package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277668 Number of n-length words over a 5-ary alphabet {a_1,a_2,...,a_5} avoiding consecutive letters a_i, a_{i+1}.
 * @author Sean A. Irvine
 */
public class A277668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277668() {
    super(new long[] {1, -2, 3, -4, 5}, new long[] {1, 5, 21, 88, 369});
  }
}
