package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054644 Number of labeled pure 2-complexes on n nodes with 3 2-simplexes.
 * @author Sean A. Irvine
 */
public class A054644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054644() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {4, 120, 1140, 6545, 27720, 95284, 280840, 735130, 1750540, 3858140});
  }
}
