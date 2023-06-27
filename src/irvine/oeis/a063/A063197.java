package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063197 Dimension of the space of weight 2n cuspidal newforms for Gamma_0( 9 ).
 * @author Sean A. Irvine
 */
public class A063197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063197() {
    super(1, new long[] {-1, 0, 1, 1, 0}, new long[] {0, 1, 1, 3, 3});
  }
}
