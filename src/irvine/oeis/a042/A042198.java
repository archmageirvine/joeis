package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042198 Numerators of continued fraction convergents to sqrt(624).
 * @author Sean A. Irvine
 */
public class A042198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042198() {
    super(new long[] {-1, 0, 50, 0}, new long[] {24, 25, 1224, 1249});
  }
}
