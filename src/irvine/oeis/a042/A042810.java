package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042810 Numerators of continued fraction convergents to sqrt(936).
 * @author Sean A. Irvine
 */
public class A042810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042810() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 10402, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 31, 61, 153, 979, 2111, 3090, 5201, 315150, 320351, 635501, 1591353, 10183619, 21958591, 32142210, 54100801});
  }
}
