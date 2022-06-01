package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168211 a(n) = (9 + 14*n + 23*(-1)^n)/4.
 * @author Sean A. Irvine
 */
public class A168211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168211() {
    super(new long[] {-1, 1, 1}, new long[] {0, 15, 7});
  }
}
