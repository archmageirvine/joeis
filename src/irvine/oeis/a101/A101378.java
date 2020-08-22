package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101378 a(n) = n^2*(n^3+1)/2.
 * @author Sean A. Irvine
 */
public class A101378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101378() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 18, 126, 520, 1575});
  }
}
