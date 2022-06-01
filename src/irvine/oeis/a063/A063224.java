package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063224 Dimension of the space of weight 2n cuspidal newforms for Gamma_0( 60 ).
 * @author Sean A. Irvine
 */
public class A063224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063224() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 4, 4});
  }
}
