package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041339 Denominators of continued fraction convergents to <code>sqrt(183)</code>.
 * @author Sean A. Irvine
 */
public class A041339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041339() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 974, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 17, 19, 36, 955, 991, 1946, 16559, 18505, 35064});
  }
}
