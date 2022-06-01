package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134241 a(n) = 8*(n-1)*(n-2)*(n-3)*(6*n^2-37*n+60).
 * @author Sean A. Irvine
 */
public class A134241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134241() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 0, 384, 4800, 25920});
  }
}
