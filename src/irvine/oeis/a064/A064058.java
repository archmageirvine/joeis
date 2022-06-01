package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064058 Ninth column of quintinomial coefficients.
 * @author Sean A. Irvine
 */
public class A064058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064058() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 15, 85, 320, 951, 2415, 5475, 11385, 22110});
  }
}
