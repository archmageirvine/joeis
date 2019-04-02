package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041516 Numerators of continued fraction convergents to sqrt(275).
 * @author Sean A. Irvine
 */
public class A041516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041516() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 398, 0, 0, 0, 0, 0}, new long[] {16, 17, 33, 83, 116, 199, 6484, 6683, 13167, 33017, 46184, 79201});
  }
}
