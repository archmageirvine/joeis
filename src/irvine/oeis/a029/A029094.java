package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029094 Expansion of <code>1/((1-x)(1-x^5)(1-x^7)(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029094() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 1, -1, 0, 0, 1, -2, 1, 0, 0, -1, 1, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 15, 17, 18});
  }
}
