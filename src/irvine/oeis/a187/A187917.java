package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187917 <code>(1/4)*(5*(n-1)*P(n)+n*P(n-1))</code> where <code>P()</code> are the Pell numbers <code>A000129</code>.
 * @author Sean A. Irvine
 */
public class A187917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187917() {
    super(new long[] {-1, -4, -2, 4}, new long[] {0, 3, 14, 50});
  }
}
