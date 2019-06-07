package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053700 <code>a(n) = 111111</code> in base <code>n</code>.
 * @author Sean A. Irvine
 */
public class A053700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053700() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {6, 63, 364, 1365, 3906, 9331});
  }
}
