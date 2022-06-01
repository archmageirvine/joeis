package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242668 Expansion of 1/(1 - 8*x + 16*x^2 + x^4 - 4*x^5).
 * @author Sean A. Irvine
 */
public class A242668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242668() {
    super(new long[] {4, -1, 0, -16, 8}, new long[] {1, 8, 48, 256, 1279});
  }
}
