package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290997 p-INVERT of <code>(1,1,1,1,1,</code>...), where p(S) <code>= 1 -</code> S^3 - S^6.
 * @author Sean A. Irvine
 */
public class A290997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290997() {
    super(new long[] {-1, 9, -18, 21, -15, 6}, new long[] {0, 0, 1, 3, 6, 12});
  }
}
