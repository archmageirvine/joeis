package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041102 Numerators of continued fraction convergents to <code>sqrt(59)</code>.
 * @author Sean A. Irvine
 */
public class A041102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041102() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1060, 0, 0, 0, 0, 0}, new long[] {7, 8, 23, 169, 361, 530, 7781, 8311, 24403, 179132, 382667, 561799});
  }
}
