package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093500 a(n) = (15*n^2 + 5*n + 2)/2.
 * @author Sean A. Irvine
 */
public class A093500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093500() {
    super(new long[] {1, -3, 3}, new long[] {11, 36, 76});
  }
}
