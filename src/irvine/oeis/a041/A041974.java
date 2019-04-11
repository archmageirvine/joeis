package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041974 Numerators of continued fraction convergents to <code>sqrt(510)</code>.
 * @author Sean A. Irvine
 */
public class A041974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041974() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 542, 0, 0, 0, 0, 0}, new long[] {22, 23, 45, 113, 158, 271, 12082, 12353, 24435, 61223, 85658, 146881});
  }
}
