package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059830 <code>a(n) = n^6 + n^4 + n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A059830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059830() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 4, 85, 820, 4369, 16276, 47989});
  }
}
