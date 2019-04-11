package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025914 Expansion of <code>1/((1-x^7)(1-x^9)(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A025914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025914() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 2, 0, 1, 1, 1, 1, 1});
  }
}
