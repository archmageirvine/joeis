package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041487 Denominators of continued fraction convergents to sqrt(260).
 * @author Sean A. Irvine
 */
public class A041487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041487() {
    super(new long[] {-1, 0, 258, 0}, new long[] {1, 8, 257, 2064});
  }
}
