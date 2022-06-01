package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093390 a(n) = floor(n/9) + floor((n+1)/9) + floor((n+2)/9).
 * @author Sean A. Irvine
 */
public class A093390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093390() {
    super(new long[] {-1, 2, -1, -1, 2, -1, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 1});
  }
}
