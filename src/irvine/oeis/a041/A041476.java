package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041476 Numerators of continued fraction convergents to sqrt(254).
 * @author Sean A. Irvine
 */
public class A041476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041476() {
    super(new long[] {-1, 0, 0, 0, 510, 0, 0, 0}, new long[] {15, 16, 239, 255, 7889, 8144, 121905, 130049});
  }
}
