package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055245 Numerator sequence of mean length of certain stackings of n+1 squares on a double staircase.
 * @author Sean A. Irvine
 */
public class A055245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055245() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {1, 1, 5, 12, 28, 61});
  }
}
