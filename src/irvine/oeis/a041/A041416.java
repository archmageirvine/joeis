package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041416 Numerators of continued fraction convergents to sqrt(223).
 * @author Sean A. Irvine
 */
public class A041416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041416() {
    super(new long[] {-1, 0, 0, 0, 448, 0, 0, 0}, new long[] {14, 15, 209, 224, 6481, 6705, 93646, 100351});
  }
}
