package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098586 <code>a(n) = (1/2) * (5*P(n+1) + P(n) - 1)</code>, where <code>P(k)</code> are the Pell numbers <code>A000129</code>.
 * @author Sean A. Irvine
 */
public class A098586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098586() {
    super(new long[] {-1, -1, 3}, new long[] {2, 5, 13});
  }
}
