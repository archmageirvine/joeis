package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041494 Numerators of continued fraction convergents to <code>sqrt(264)</code>.
 * @author Sean A. Irvine
 */
public class A041494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041494() {
    super(new long[] {-1, 0, 130, 0}, new long[] {16, 65, 2096, 8449});
  }
}
