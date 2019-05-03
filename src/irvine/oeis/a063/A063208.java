package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063208 Dimension of the space of weight <code>2n</code> cuspidal newforms for <code>Gamma_0( 36 )</code>.
 * @author Sean A. Irvine
 */
public class A063208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063208() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 1, 2, 3, 4});
  }
}
