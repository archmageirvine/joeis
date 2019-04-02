package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041305 Denominators of continued fraction convergents to sqrt(165).
 * @author Sean A. Irvine
 */
public class A041305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041305() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2158, 0, 0, 0, 0, 0}, new long[] {1, 1, 6, 13, 71, 84, 2087, 2171, 12942, 28055, 153217, 181272});
  }
}
