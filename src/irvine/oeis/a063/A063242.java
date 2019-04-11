package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063242 Dimension of the space of weight <code>2n</code> cuspidal newforms for Gamma_0( <code>92 )</code>.
 * @author Sean A. Irvine
 */
public class A063242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063242() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {2, 6, 8, 14, 16});
  }
}
