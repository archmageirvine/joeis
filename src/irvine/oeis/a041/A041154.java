package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041154 Numerators of continued fraction convergents to sqrt(87).
 * @author Sean A. Irvine
 */
public class A041154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041154() {
    super(new long[] {-1, 0, 56, 0}, new long[] {9, 28, 513, 1567});
  }
}
