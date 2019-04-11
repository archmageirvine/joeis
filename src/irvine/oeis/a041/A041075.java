package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041075 Denominators of continued fraction convergents to <code>sqrt(44)</code>.
 * @author Sean A. Irvine
 */
public class A041075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041075() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 398, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 8, 11, 19, 30, 379, 409, 788, 1197, 3182, 4379, 7561, 11940});
  }
}
