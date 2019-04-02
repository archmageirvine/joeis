package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042297 Denominators of continued fraction convergents to sqrt(674).
 * @author Sean A. Irvine
 */
public class A042297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042297() {
    super(new long[] {-1, 0, 0, 0, 1350, 0, 0, 0}, new long[] {1, 1, 25, 26, 1325, 1351, 33749, 35100});
  }
}
