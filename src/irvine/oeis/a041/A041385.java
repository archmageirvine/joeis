package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041385 Denominators of continued fraction convergents to sqrt(207).
 * @author Sean A. Irvine
 */
public class A041385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041385() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2302, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 13, 18, 31, 80, 2271, 4622, 6893, 11515, 29923, 41438, 71361, 184160});
  }
}
