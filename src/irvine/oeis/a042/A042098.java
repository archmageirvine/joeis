package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042098 Numerators of continued fraction convergents to sqrt(573).
 * @author Sean A. Irvine
 */
public class A042098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042098() {
    super(new long[] {-1, 0, 0, 0, 766, 0, 0, 0}, new long[] {23, 24, 359, 383, 17977, 18360, 275017, 293377});
  }
}
