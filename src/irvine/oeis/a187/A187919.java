package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187919 a(n) = (19/28)*(3^n-1)*P(n-1)+(3/7)*(4*3^n-5)*P(n) where P() are the Pell numbers A000129.
 * @author Sean A. Irvine
 */
public class A187919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187919() {
    super(1, new long[] {-9, -24, -2, 8}, new long[] {3, 32, 256, 1912});
  }
}
