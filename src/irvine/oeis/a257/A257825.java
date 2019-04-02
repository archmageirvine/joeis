package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257825 Positive integers whose square is the sum of 74 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257825() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 7398, 0, 0, 0, 0, 0}, new long[] {2257, 2849, 21941, 27713, 604765, 763865, 16669573, 21054961, 162316669, 205018517, 4474051285L, 5651073085L});
  }
}
