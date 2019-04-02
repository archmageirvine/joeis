package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041517 Denominators of continued fraction convergents to sqrt(275).
 * @author Sean A. Irvine
 */
public class A041517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041517() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 398, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 7, 12, 391, 403, 794, 1991, 2785, 4776});
  }
}
