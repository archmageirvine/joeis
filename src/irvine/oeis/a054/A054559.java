package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054559 Number of labeled pure 2-complexes on n nodes (0-simplexes) with 5 2-simplexes and 8 1-simplexes.
 * @author Sean A. Irvine
 */
public class A054559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054559() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {30, 180, 630, 1680, 3780, 7560});
  }
}
