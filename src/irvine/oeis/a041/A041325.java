package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041325 Denominators of continued fraction convergents to sqrt(176).
 * @author Sean A. Irvine
 */
public class A041325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041325() {
    super(new long[] {-1, 0, 0, 0, 398, 0, 0, 0}, new long[] {1, 3, 4, 15, 394, 1197, 1591, 5970});
  }
}
