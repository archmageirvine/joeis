package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041348 Numerators of continued fraction convergents to sqrt(188).
 * @author Sean A. Irvine
 */
public class A041348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041348() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9214, 0, 0, 0, 0, 0, 0, 0}, new long[] {13, 14, 41, 96, 617, 1330, 3277, 4607, 123059, 127666, 378391, 884448, 5685079, 12254606, 30194291, 42448897});
  }
}
