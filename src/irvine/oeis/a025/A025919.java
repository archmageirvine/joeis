package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025919 Expansion of 1/((1-x^8)(1-x^9)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A025919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025919() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 2});
  }
}
