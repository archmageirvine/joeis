package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041098 Numerators of continued fraction convergents to <code>sqrt(57)</code>.
 * @author Sean A. Irvine
 */
public class A041098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041098() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 302, 0, 0, 0, 0, 0}, new long[] {7, 8, 15, 68, 83, 151, 2197, 2348, 4545, 20528, 25073, 45601});
  }
}
