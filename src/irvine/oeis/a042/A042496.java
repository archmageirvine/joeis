package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042496 Numerators of continued fraction convergents to sqrt(776).
 * @author Sean A. Irvine
 */
public class A042496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042496() {
    super(new long[] {-1, 0, 0, 0, 390, 0, 0, 0}, new long[] {27, 28, 167, 195, 10697, 10892, 65157, 76049});
  }
}
