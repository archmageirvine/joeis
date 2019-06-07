package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225879 Number of n-length words w over ternary alphabet <code>{1,2,3}</code> such that for every prefix z of w we have <code>0&lt;=#(z,1)-#(z,2)&lt;=2</code> and <code>0&lt;=#(z,2)-#(z,3)&lt;=2</code> and <code>#(z,x)</code> gives the number of occurrences of letter x in <code>z</code>.
 * @author Sean A. Irvine
 */
public class A225879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225879() {
    super(new long[] {2, 0, 0, 7, 0, 0}, new long[] {1, 1, 2, 3, 7, 14});
  }
}
