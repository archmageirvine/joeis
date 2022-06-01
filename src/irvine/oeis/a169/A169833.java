package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169833 a(n) = 25*2^(n+3) - (198+392*n/3+36*n^2+10*n^3/3).
 * @author Sean A. Irvine
 */
public class A169833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169833() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {2, 32, 170, 596, 1690});
  }
}
