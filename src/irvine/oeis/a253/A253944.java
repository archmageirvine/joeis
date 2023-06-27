package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253944 a(n) = 3*binomial(n+1,7).
 * @author Sean A. Irvine
 */
public class A253944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253944() {
    super(6, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {3, 24, 108, 360, 990, 2376, 5148, 10296});
  }
}
