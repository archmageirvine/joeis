package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187919 <code>a(n) = (19/28)*(3^n-1)*P(n-1)+(3/7)*(4*3^n-5)*P(n)</code> where <code>P()</code> are the Pell numbers <code>A000129</code>.
 * @author Sean A. Irvine
 */
public class A187919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187919() {
    super(new long[] {-9, -24, -2, 8}, new long[] {3, 32, 256, 1912});
  }
}
