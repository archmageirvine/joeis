package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025919 Expansion of <code>1/((1-x^8)(1-x^9)(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A025919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025919() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 2});
  }
}
