package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041524 Numerators of continued fraction convergents to sqrt(279).
 * @author Sean A. Irvine
 */
public class A041524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041524() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3040, 0, 0, 0, 0, 0, 0, 0}, new long[] {16, 17, 50, 117, 167, 451, 1069, 1520, 49709, 51229, 152167, 355563, 507730, 1371023, 3249776, 4620799});
  }
}
