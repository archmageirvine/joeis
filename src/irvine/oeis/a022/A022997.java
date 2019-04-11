package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022997 Numerator of <code>n*(n-2)*(2*n-1)/(2*(n-1))</code>.
 * @author Sean A. Irvine
 */
public class A022997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022997() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {0, 15, 28, 135, 132, 455, 360, 1071});
  }
}
