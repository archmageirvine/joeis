package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098586 a(n) = (1/2) * (5*P(n+1) + P(n) - 1), where P(k) are the Pell numbers A000129.
 * @author Sean A. Irvine
 */
public class A098586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098586() {
    super(new long[] {-1, -1, 3}, new long[] {2, 5, 13});
  }
}
