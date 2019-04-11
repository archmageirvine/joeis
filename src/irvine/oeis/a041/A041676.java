package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041676 Numerators of continued fraction convergents to <code>sqrt(357)</code>.
 * @author Sean A. Irvine
 */
public class A041676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041676() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 6802, 0, 0, 0, 0, 0}, new long[] {18, 19, 170, 359, 3042, 3401, 125478, 128879, 1156510, 2441899, 20691702, 23133601});
  }
}
