package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063201 Dimension of the space of weight <code>2n</code> cuspidal newforms for Gamma_0( 18 ).
 * @author Sean A. Irvine
 */
public class A063201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063201() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 1, 3, 2, 4});
  }
}
