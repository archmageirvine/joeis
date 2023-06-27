package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054557 Number of labeled pure 2-complexes on n nodes (0-simplexes) with 5 2-simplexes and 10 1-simplexes.
 * @author Sean A. Irvine
 */
public class A054557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054557() {
    super(5, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {72, 4824, 32256, 127008, 378000, 940464, 2062368});
  }
}
