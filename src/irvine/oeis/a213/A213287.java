package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213287 Number of 8-length words w over n-ary alphabet such that for every prefix z of w we have <code>#(z,a_i) = 0</code> or <code>#(z,a_i) &gt;= #(z,a_j)</code> for all j&gt;i and <code>#(z,a_i)</code> counts the occurrences of the i-th letter in <code>z</code>.
 * @author Sean A. Irvine
 */
public class A213287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213287() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 91, 869, 4895, 21562, 83728, 296268, 977026});
  }
}
