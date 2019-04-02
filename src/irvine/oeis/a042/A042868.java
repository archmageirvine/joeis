package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042868 Numerators of continued fraction convergents to sqrt(966).
 * @author Sean A. Irvine
 */
public class A042868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042868() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 114998, 0, 0, 0, 0, 0}, new long[] {31, 373, 777, 1927, 4631, 57499, 3569569, 42892327, 89354223, 221600773, 532555769, 6612270001L});
  }
}
