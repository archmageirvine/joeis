package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042292 Numerators of continued fraction convergents to sqrt(672).
 * @author Sean A. Irvine
 */
public class A042292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042292() {
    super(new long[] {-1, 0, 0, 0, 674, 0, 0, 0}, new long[] {25, 26, 311, 337, 17161, 17498, 209639, 227137});
  }
}
