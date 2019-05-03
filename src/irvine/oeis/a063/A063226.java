package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063226 Dimension of the space of weight <code>2n</code> cuspidal newforms for <code>Gamma_0(63)</code>.
 * @author Sean A. Irvine
 */
public class A063226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063226() {
    super(new long[] {-1, 1, 1}, new long[] {3, 7, 13});
  }
}
