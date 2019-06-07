package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213286 Number of 7-length words w over n-ary alphabet such that for every prefix z of w we have <code>#(z,a_i) = 0</code> or <code>#(z,a_i) &gt;= #(z,a_j)</code> for all j&gt;i and <code>#(z,a_i)</code> counts the occurrences of the i-th letter in <code>z</code>.
 * @author Sean A. Irvine
 */
public class A213286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213286() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 46, 367, 1805, 7280, 25781, 83916});
  }
}
