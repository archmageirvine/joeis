package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129370 a(n)=n^2-(n-1)^2*(1-(-1)^n)/8.
 * @author Sean A. Irvine
 */
public class A129370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129370() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 4, 8, 16, 21});
  }
}
