package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213288 Number of 9-length words w over n-ary alphabet such that for every prefix z of w we have <code>#(z,a_i) = 0</code> or <code>#(z,a_i) &gt;= #(z,a_j)</code> for all j&gt;i and <code>#(z,a_i)</code> counts the occurrences of the i-th letter in <code>z</code>.
 * @author Sean A. Irvine
 */
public class A213288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213288() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 162, 2074, 13280, 64924, 273248, 1050777, 3754472, 12602451});
  }
}
