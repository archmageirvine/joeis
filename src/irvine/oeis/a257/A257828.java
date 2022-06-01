package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257828 Positive integers whose square is the sum of 97 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257828() {
    super(new long[] {-1, 0, 0, 125619266, 0, 0}, new long[] {679, 1545404, 3675742735L, 81619738879L, 194132514608060L, 461744104375531831L});
  }
}
