package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180669 a(n) = a(n-1)+a(n-2)+a(n-3)+4*n^2-16*n+18 with a(0)=0, a(1)=0 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A180669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180669() {
    super(new long[] {-1, 2, -1, 2, -5, 4}, new long[] {0, 0, 1, 7, 26, 72});
  }
}
