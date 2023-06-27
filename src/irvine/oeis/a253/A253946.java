package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253946 a(n) = 6*binomial(n+1, 6).
 * @author Sean A. Irvine
 */
public class A253946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253946() {
    super(5, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {6, 42, 168, 504, 1260, 2772, 5544});
  }
}
