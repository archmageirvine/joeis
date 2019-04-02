package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042374 Numerators of continued fraction convergents to sqrt(714).
 * @author Sean A. Irvine
 */
public class A042374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042374() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8230, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {26, 27, 80, 107, 187, 481, 668, 1149, 2966, 4115, 216946, 221061, 659068, 880129, 1539197, 3958523, 5497720, 9456243, 24410206, 33866449});
  }
}
