package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063204 Dimension of the space of weight <code>2n</code> cuspidal newforms for <code>Gamma_0( 25 )</code>.
 * @author Sean A. Irvine
 */
public class A063204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063204() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 3, 7, 9, 13});
  }
}
