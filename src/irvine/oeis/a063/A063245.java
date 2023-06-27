package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063245 Dimension of the space of weight 2n cuspidal newforms for Gamma_0( 98 ).
 * @author Sean A. Irvine
 */
public class A063245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063245() {
    super(1, new long[] {-1, 0, 1, 1, 0}, new long[] {3, 10, 18, 23, 31});
  }
}
