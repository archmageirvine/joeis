package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114052 x such that <code>x^2 - 27*y^2 = 1</code>.
 * @author Sean A. Irvine
 */
public class A114052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114052() {
    super(new long[] {-1, 52}, new long[] {1, 26});
  }
}
