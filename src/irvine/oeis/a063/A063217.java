package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063217 Dimension of the space of weight <code>2n</code> cuspidal newforms for Gamma_0( 50 ).
 * @author Sean A. Irvine
 */
public class A063217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063217() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {2, 5, 7, 12, 14});
  }
}
