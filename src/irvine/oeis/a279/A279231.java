package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279231 Expansion of g.f. 1/((1 - x)^2*(1 - 3*x + 3*x^2)).
 * @author Sean A. Irvine
 */
public class A279231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279231() {
    super(new long[] {-3, 9, -10, 5}, new long[] {1, 5, 15, 34});
  }
}
