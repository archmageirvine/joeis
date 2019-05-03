package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054557 Number of labeled pure 2-complexes on n nodes <code>(0-simplexes)</code> with <code>5 2-simplexes</code> and <code>10 1-simplexes</code>.
 * @author Sean A. Irvine
 */
public class A054557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054557() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {72, 4824, 32256, 127008, 378000, 940464, 2062368});
  }
}
