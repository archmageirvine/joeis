package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041650 Numerators of continued fraction convergents to sqrt(344).
 * @author Sean A. Irvine
 */
public class A041650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041650() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20810, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {18, 19, 37, 167, 204, 779, 983, 4711, 5694, 10405, 380274, 390679, 770953, 3474491, 4245444, 16210823, 20456267, 98035891, 118492158, 216528049});
  }
}
