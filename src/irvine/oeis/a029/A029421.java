package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029421 Expansion of <code>1/((1-x^6)(1-x^7)(1-x^10)(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A029421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029421() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, -1, 0, 0, -1, -1, -1, -1, 0, 0, -1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 1, 2, 2, 2, 1, 2, 1, 4, 2, 3, 2, 3, 2, 5, 4, 4, 3, 5});
  }
}
