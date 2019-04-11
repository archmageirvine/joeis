package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041188 Numerators of continued fraction convergents to <code>sqrt(105)</code>.
 * @author Sean A. Irvine
 */
public class A041188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041188() {
    super(new long[] {-1, 0, 82, 0}, new long[] {10, 41, 830, 3361});
  }
}
