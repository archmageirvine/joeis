package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192370 Sum of all the n-digit numbers whose digits are all even and nonzero: 2,4,6,8.
 * @author Sean A. Irvine
 */
public class A192370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192370() {
    super(new long[] {-160, 44}, new long[] {20, 880});
  }
}
