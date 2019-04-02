package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042468 Numerators of continued fraction convergents to sqrt(762).
 * @author Sean A. Irvine
 */
public class A042468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042468() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12698, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {27, 28, 55, 83, 138, 1187, 1325, 2512, 3837, 6349, 346683, 353032, 699715, 1052747, 1752462, 15072443, 16824905, 31897348, 48722253, 80619601});
  }
}
