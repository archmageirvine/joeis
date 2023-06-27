package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063216 Dimension of the space of weight 2n cuspidal newforms for Gamma_0( 49 ).
 * @author Sean A. Irvine
 */
public class A063216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063216() {
    super(1, new long[] {-1, 0, 1, 1, 0}, new long[] {1, 8, 14, 22, 28});
  }
}
