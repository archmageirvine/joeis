package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018206 Expansion of 1/((1-3x)(1-10x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A018206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018206() {
    super(new long[] {330, -173, 24}, new long[] {1, 24, 403});
  }
}
