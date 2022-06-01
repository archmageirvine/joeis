package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213285 Number of 6-length words w over n-ary alphabet such that for every prefix z of w we have #(z,a_i) = 0 or #(z,a_i) &gt;= #(z,a_j) for all j&gt;i and #(z,a_i) counts the occurrences of the i-th letter in z.
 * @author Sean A. Irvine
 */
public class A213285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213285() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 27, 165, 712, 2535, 8151});
  }
}
