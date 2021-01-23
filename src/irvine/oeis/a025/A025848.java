package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025848 Expansion of 1/((1-x^3)(1-x^7)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A025848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025848() {
    super(new long[] {1, 0, 0, -1, 0, 0, 0, -1, 0, 0, 1, -1, 0, 0, 1, 0, 0, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 2});
  }
}
