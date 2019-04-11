package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059721 Mean of first six positive powers of <code>n,</code> i.e., <code>(n + n^2 + n^3 + n^4 + n^5 + n^6)/6</code>.
 * @author Sean A. Irvine
 */
public class A059721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059721() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 21, 182, 910, 3255, 9331});
  }
}
