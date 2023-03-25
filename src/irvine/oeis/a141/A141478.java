package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141478 a(n) = binomial(n+2,3)*4^3.
 * @author Sean A. Irvine
 */
public class A141478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141478() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 256, 640, 1280});
  }
}
