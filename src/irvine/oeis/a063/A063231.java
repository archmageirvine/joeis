package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063231 Dimension of the space of weight 2n cuspidal newforms for Gamma_0( 75 ).
 * @author Sean A. Irvine
 */
public class A063231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063231() {
    super(1, new long[] {-1, 0, 1, 1, 0}, new long[] {3, 10, 15, 23, 28});
  }
}
