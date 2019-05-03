package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063224 Dimension of the space of weight <code>2n</code> cuspidal newforms for <code>Gamma_0( 60 )</code>.
 * @author Sean A. Irvine
 */
public class A063224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063224() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 4, 4});
  }
}
