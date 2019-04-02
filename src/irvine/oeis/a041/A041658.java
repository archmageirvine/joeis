package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041658 Numerators of continued fraction convergents to sqrt(348).
 * @author Sean A. Irvine
 */
public class A041658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041658() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3134, 0, 0, 0, 0, 0, 0, 0}, new long[] {18, 19, 37, 56, 485, 541, 1026, 1567, 57438, 59005, 116443, 175448, 1520027, 1695475, 3215502, 4910977});
  }
}
