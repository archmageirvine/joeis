package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042298 Numerators of continued fraction convergents to <code>sqrt(675)</code>.
 * @author Sean A. Irvine
 */
public class A042298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042298() {
    super(new long[] {-1, 0, 52, 0}, new long[] {25, 26, 1325, 1351});
  }
}
