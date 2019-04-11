package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025809 Expansion of <code>1/((1-x^2)(1-x^5)(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A025809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025809() {
    super(new long[] {1, 0, -1, 0, 0, -1, 0, 1, 0, -1, 0, 1, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3});
  }
}
