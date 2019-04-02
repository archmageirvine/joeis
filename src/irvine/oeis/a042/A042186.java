package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042186 Numerators of continued fraction convergents to sqrt(618).
 * @author Sean A. Irvine
 */
public class A042186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042186() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 20186, 0, 0, 0, 0, 0}, new long[] {24, 25, 174, 1417, 8676, 10093, 493140, 503233, 3512538, 28603537, 175133760, 203737297});
  }
}
