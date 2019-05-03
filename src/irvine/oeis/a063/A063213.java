package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063213 Dimension of the space of weight <code>2n</code> cuspidal newforms for <code>Gamma_0(45)</code>.
 * @author Sean A. Irvine
 */
public class A063213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063213() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 5, 9, 11});
  }
}
