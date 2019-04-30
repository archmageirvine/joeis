package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094705 Convolution of <code>Jacobsthal(n)</code> and <code>3^n</code>.
 * @author Sean A. Irvine
 */
public class A094705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094705() {
    super(new long[] {-6, -1, 4}, new long[] {0, 1, 4});
  }
}
