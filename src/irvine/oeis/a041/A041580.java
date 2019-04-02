package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041580 Numerators of continued fraction convergents to sqrt(308).
 * @author Sean A. Irvine
 */
public class A041580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041580() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 702, 0, 0, 0, 0, 0}, new long[] {17, 18, 35, 158, 193, 351, 12127, 12478, 24605, 110898, 135503, 246401});
  }
}
