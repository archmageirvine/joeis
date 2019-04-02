package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041510 Numerators of continued fraction convergents to sqrt(272).
 * @author Sean A. Irvine
 */
public class A041510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041510() {
    super(new long[] {-1, 0, 66, 0}, new long[] {16, 33, 1072, 2177});
  }
}
