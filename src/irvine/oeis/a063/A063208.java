package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063208 Dimension of the space of weight 2n cuspidal newforms for Gamma_0( 36 ).
 * @author Sean A. Irvine
 */
public class A063208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063208() {
    super(1, new long[] {-1, 0, 1, 1, 0}, new long[] {1, 1, 2, 3, 4});
  }
}
