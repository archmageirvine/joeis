package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041293 Denominators of continued fraction convergents to sqrt(159).
 * @author Sean A. Irvine
 */
public class A041293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041293() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2648, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 18, 23, 41, 64, 105, 2584, 2689, 5273, 7962, 13235, 47667, 60902, 108569, 169471, 278040});
  }
}
