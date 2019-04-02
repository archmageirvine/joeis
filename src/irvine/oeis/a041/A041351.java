package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041351 Denominators of continued fraction convergents to sqrt(189).
 * @author Sean A. Irvine
 */
public class A041351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041351() {
    super(new long[] {-1, 0, 0, 0, 110, 0, 0, 0}, new long[] {1, 1, 3, 4, 107, 111, 329, 440});
  }
}
