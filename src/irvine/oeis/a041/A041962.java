package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041962 Numerators of continued fraction convergents to <code>sqrt(504)</code>.
 * @author Sean A. Irvine
 */
public class A041962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041962() {
    super(new long[] {-1, 0, 0, 0, 898, 0, 0, 0}, new long[] {22, 45, 202, 449, 19958, 40365, 181418, 403201});
  }
}
