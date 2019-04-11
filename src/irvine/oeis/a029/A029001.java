package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029001 Expansion of <code>1/((1-x)(1-x^2)(1-x^3)(1-x^7))</code>.
 * @author Sean A. Irvine
 */
public class A029001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029001() {
    super(new long[] {-1, 1, 1, 0, -1, -1, 1, 1, -1, -1, 0, 1, 1}, new long[] {1, 1, 2, 3, 4, 5, 7, 9, 11, 14, 17, 20, 24});
  }
}
