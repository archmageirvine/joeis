package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041233 Denominators of continued fraction convergents to sqrt(128).
 * @author Sean A. Irvine
 */
public class A041233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041233() {
    super(new long[] {-1, 0, 0, 0, 1154, 0, 0, 0}, new long[] {1, 3, 16, 51, 1138, 3465, 18463, 58854});
  }
}
