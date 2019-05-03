package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173200 Solutions y of the Mordell equation <code>y^2 = x^3 - 3a^2 - 1</code> for a <code>= 0,1,2</code>, ... <code>(solutions x</code> are given by <code>A053755)</code>.
 * @author Sean A. Irvine
 */
public class A173200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173200() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 11, 70, 225});
  }
}
