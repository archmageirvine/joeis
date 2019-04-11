package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041193 Denominators of continued fraction convergents to <code>sqrt(107)</code>.
 * @author Sean A. Irvine
 */
public class A041193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041193() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1924, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 29, 32, 93, 1892, 3877, 5769, 55798, 61567, 178932});
  }
}
