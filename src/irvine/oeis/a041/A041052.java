package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041052 Numerators of continued fraction convergents to sqrt(32).
 * @author Sean A. Irvine
 */
public class A041052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041052() {
    super(new long[] {-1, 0, 0, 0, 34, 0, 0, 0}, new long[] {5, 6, 11, 17, 181, 198, 379, 577});
  }
}
