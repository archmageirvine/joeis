package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042657 Denominators of continued fraction convergents to sqrt(858).
 * @author Sean A. Irvine
 */
public class A042657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042657() {
    super(new long[] {-1, 0, 0, 0, 1406, 0, 0, 0}, new long[] {1, 3, 7, 24, 1399, 4221, 9841, 33744});
  }
}
