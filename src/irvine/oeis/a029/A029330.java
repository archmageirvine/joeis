package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029330 Expansion of <code>1/((1-x^4)(1-x^5)(1-x^6)(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029330() {
    super(new long[] {-1, 0, 0, 0, 1, 1, 1, 0, 0, -1, -1, 0, 0, 0, 0, 0, -1, -1, 0, 0, 1, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 2, 2, 2, 1, 2, 3, 4, 3, 3, 3, 5, 5, 6, 5, 6, 6});
  }
}
