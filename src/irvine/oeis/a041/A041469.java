package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041469 Denominators of continued fraction convergents to <code>sqrt(250)</code>.
 * @author Sean A. Irvine
 */
public class A041469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041469() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 8886, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 5, 16, 53, 228, 281, 8658, 8939, 44414, 142181, 470957, 2026009, 2496966});
  }
}
