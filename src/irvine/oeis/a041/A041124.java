package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041124 Numerators of continued fraction convergents to sqrt(71).
 * @author Sean A. Irvine
 */
public class A041124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041124() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 6960, 0, 0, 0, 0, 0, 0, 0}, new long[] {8, 17, 42, 59, 455, 514, 1483, 3480, 57163, 117806, 292775, 410581, 3166842, 3577423, 10321688, 24220799});
  }
}
