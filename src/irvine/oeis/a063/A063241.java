package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063241 Dimension of the space of weight <code>2n</code> cuspidal newforms for <code>Gamma_0(90)</code>.
 * @author Sean A. Irvine
 */
public class A063241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063241() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 5, 7, 13});
  }
}
