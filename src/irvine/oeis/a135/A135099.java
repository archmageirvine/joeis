package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135099 a(1)=1, a(n) = a(n-1) + n^5 if n odd, a(n) = a(n-1) + n^3 if n is even.
 * @author Sean A. Irvine
 */
public class A135099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135099() {
    super(new long[] {1, -1, -6, 6, 15, -15, -20, 20, 15, -15, -6, 6, 1}, new long[] {1, 9, 252, 316, 3441, 3657, 20464, 20976, 80025, 81025, 242076, 243804, 615097});
  }
}
