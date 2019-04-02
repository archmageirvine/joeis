package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279890 Expansion of x*(1 - x + 2 x^3 - x^4)/((1 - x)*(1 + x)*(1 - x + x^2)*(1 - x - x^2)).
 * @author Sean A. Irvine
 */
public class A279890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279890() {
    super(new long[] {-1, 0, 2, -2, 0, 2}, new long[] {0, 1, 1, 2, 4, 7});
  }
}
