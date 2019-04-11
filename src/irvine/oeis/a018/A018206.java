package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018206 Expansion of <code>1/((1-3x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A018206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018206() {
    super(new long[] {330, -173, 24}, new long[] {1, 24, 403});
  }
}
