package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029349 Expansion of <code>1/((1-x^4)(1-x^6)(1-x^7)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029349() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, -1, 0, -1, -1, 0, -1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 2, 1, 2, 1, 3, 1, 3, 2, 4, 2, 5, 3, 5, 3, 7, 4, 7});
  }
}
