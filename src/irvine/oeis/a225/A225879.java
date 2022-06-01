package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225879 Number of n-length words w over ternary alphabet {1,2,3} such that for every prefix z of w we have 0&lt;=#(z,1)-#(z,2)&lt;=2 and 0&lt;=#(z,2)-#(z,3)&lt;=2 and #(z,x) gives the number of occurrences of letter x in z.
 * @author Sean A. Irvine
 */
public class A225879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225879() {
    super(new long[] {2, 0, 0, 7, 0, 0}, new long[] {1, 1, 2, 3, 7, 14});
  }
}
