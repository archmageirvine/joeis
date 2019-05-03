package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247851 The 6th Hermite Polynomial evaluated at n: <code>H_6(n) = 64*n^6-480*n^4+720*n^2-120</code>.
 * @author Sean A. Irvine
 */
public class A247851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247851() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {-120, 184, -824, 14136, 150664, 717880, 2389704});
  }
}
