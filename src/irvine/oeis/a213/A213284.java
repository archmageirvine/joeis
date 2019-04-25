package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213284 Number of 5-length words w over n-ary alphabet such that for every prefix z of w we have #(z,a_i) <code>= 0</code> or #(z,a_i) <code>&gt;=</code> #(z,a_j) for all <code>j&gt;i</code> and #(z,a_i) counts the occurrences of the i-th letter in z.
 * @author Sean A. Irvine
 */
public class A213284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213284() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 14, 74, 276, 895});
  }
}
