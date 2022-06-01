package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239352 van Heijst's upper bound on the number of squares inscribed by a real algebraic curve in R^2 of degree n, if the number is finite.
 * @author Sean A. Irvine
 */
public class A239352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239352() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 1, 12, 48});
  }
}
