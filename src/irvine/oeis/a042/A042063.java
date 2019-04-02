package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042063 Denominators of continued fraction convergents to sqrt(555).
 * @author Sean A. Irvine
 */
public class A042063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042063() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3628, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 9, 34, 43, 77, 3585, 3662, 7247, 25403, 32650, 123353, 156003, 279356});
  }
}
