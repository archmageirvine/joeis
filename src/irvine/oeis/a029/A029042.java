package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029042 Expansion of <code>1/((1-x)(1-x^3)(1-x^5)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029042() {
    super(new long[] {-1, 1, 0, 1, -1, 1, -1, 0, -1, 1, 1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 8, 9, 10, 12, 13, 16, 18, 19, 22});
  }
}
