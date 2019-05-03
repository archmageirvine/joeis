package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063231 Dimension of the space of weight <code>2n</code> cuspidal newforms for <code>Gamma_0( 75 )</code>.
 * @author Sean A. Irvine
 */
public class A063231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063231() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {3, 10, 15, 23, 28});
  }
}
