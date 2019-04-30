package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213286 Number of 7-length words w over n-ary alphabet such that for every prefix z of w we have <code>#(z</code>,a_i) <code>= 0</code> or <code>#(z</code>,a_i) <code>&gt;= #(z</code>,a_j) for all <code>j&gt;i</code> and <code>#(z</code>,a_i) counts the occurrences of the i-th letter in z.
 * @author Sean A. Irvine
 */
public class A213286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213286() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 46, 367, 1805, 7280, 25781, 83916});
  }
}
