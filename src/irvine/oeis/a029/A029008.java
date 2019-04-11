package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029008 Expansion of <code>1/((1-x)(1-x^2)(1-x^4)(1-x^7))</code>.
 * @author Sean A. Irvine
 */
public class A029008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029008() {
    super(new long[] {-1, 1, 1, -1, 1, -1, -1, 2, -1, -1, 1, -1, 1, 1}, new long[] {1, 1, 2, 2, 4, 4, 6, 7, 10, 11, 14, 16, 20, 22});
  }
}
