package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054559 Number of labeled pure 2-complexes on n nodes <code>(0-simplexes)</code> with <code>5 2-simplexes</code> and <code>8 1-simplexes</code>.
 * @author Sean A. Irvine
 */
public class A054559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054559() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {30, 180, 630, 1680, 3780, 7560});
  }
}
