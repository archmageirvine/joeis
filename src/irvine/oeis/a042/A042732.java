package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042732 Numerators of continued fraction convergents to sqrt(896).
 * @author Sean A. Irvine
 */
public class A042732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042732() {
    super(new long[] {-1, 0, 0, 0, 898, 0, 0, 0}, new long[] {29, 30, 419, 449, 26461, 26910, 376291, 403201});
  }
}
