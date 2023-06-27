package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063246 Dimension of the space of weight 2n cuspidal newforms for Gamma_0( 99 ).
 * @author Sean A. Irvine
 */
public class A063246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063246() {
    super(1, new long[] {-1, 0, 1, 1, 0}, new long[] {4, 12, 22, 28, 38});
  }
}
