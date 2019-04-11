package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063197 Dimension of the space of weight <code>2n</code> cuspidal newforms for Gamma_0( <code>9 )</code>.
 * @author Sean A. Irvine
 */
public class A063197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063197() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 1, 1, 3, 3});
  }
}
