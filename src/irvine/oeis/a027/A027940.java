package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027940 <code>a(n) = T(2*n, n+4)</code>, T given by <code>A027935</code>.
 * @author Sean A. Irvine
 */
public class A027940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027940() {
    super(new long[] {-1, 11, -53, 148, -266, 322, -266, 148, -53, 11},
      new long[] {1, 46, 551, 3785, 18955, 77533, 276408, 895103, 2708322, 7811510});
  }
}
