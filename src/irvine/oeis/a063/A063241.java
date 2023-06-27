package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063241 Dimension of the space of weight 2n cuspidal newforms for Gamma_0(90).
 * @author Sean A. Irvine
 */
public class A063241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063241() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {3, 5, 7, 13});
  }
}
