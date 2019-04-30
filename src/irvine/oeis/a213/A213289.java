package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213289 Number of 10-length words w over n-ary alphabet such that for every prefix z of w we have <code>#(z</code>,a_i) <code>= 0</code> or <code>#(z</code>,a_i) <code>&gt;= #(z</code>,a_j) for all <code>j&gt;i</code> and <code>#(z</code>,a_i) counts the occurrences of the i-th letter in z.
 * @author Sean A. Irvine
 */
public class A213289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213289() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 323, 5168, 37993, 201975, 916966, 3771418, 14486158, 52359693, 178880725});
  }
}
