package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041164 Numerators of continued fraction convergents to sqrt(92).
 * @author Sean A. Irvine
 */
public class A041164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041164() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2302, 0, 0, 0, 0, 0, 0, 0}, new long[] {9, 10, 19, 48, 211, 470, 681, 1151, 21399, 22550, 43949, 110448, 485741, 1081930, 1567671, 2649601});
  }
}
