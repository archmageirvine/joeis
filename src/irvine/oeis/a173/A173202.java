package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173202 Solutions y of the Mordell equation <code>y^2 = x^3 - 3a^2 + 1</code> for a <code>= 0,1,2, ..</code>. (solutions x are given by the sequence A000466).
 * @author Sean A. Irvine
 */
public class A173202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173202() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 58, 207});
  }
}
