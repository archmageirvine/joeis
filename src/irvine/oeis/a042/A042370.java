package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042370 Numerators of continued fraction convergents to sqrt(712).
 * @author Sean A. Irvine
 */
public class A042370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042370() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3202, 0, 0, 0, 0, 0}, new long[] {26, 27, 80, 507, 1094, 1601, 84346, 85947, 256240, 1623387, 3503014, 5126401});
  }
}
