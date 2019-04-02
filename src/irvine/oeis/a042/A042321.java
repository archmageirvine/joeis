package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042321 Denominators of continued fraction convergents to sqrt(687).
 * @author Sean A. Irvine
 */
public class A042321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042321() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 330674, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 14, 19, 318, 337, 992, 1329, 6308, 329345, 1323688, 1653033, 4629754, 6282787, 105154346, 111437133, 328028612, 439465745, 2085891592});
  }
}
