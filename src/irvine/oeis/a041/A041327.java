package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041327 Denominators of continued fraction convergents to <code>sqrt(177)</code>.
 * @author Sean A. Irvine
 */
public class A041327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041327() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 124846, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 10, 23, 194, 411, 1427, 4692, 123419, 374949, 1248266, 2871481, 24220114, 51311709, 178155241, 585777432});
  }
}
