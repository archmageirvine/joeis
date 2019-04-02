package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041297 Denominators of continued fraction convergents to sqrt(161).
 * @author Sean A. Irvine
 */
public class A041297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041297() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23550, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 13, 16, 45, 61, 289, 639, 928, 22911, 23839, 70589, 306195, 376784, 1059763, 1436547, 6805951, 15048449, 21854400});
  }
}
