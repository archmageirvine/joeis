package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042154 Numerators of continued fraction convergents to <code>sqrt(602)</code>.
 * @author Sean A. Irvine
 */
public class A042154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042154() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1374, 0, 0, 0, 0, 0}, new long[] {24, 25, 49, 319, 368, 687, 33344, 34031, 67375, 438281, 505656, 943937});
  }
}
