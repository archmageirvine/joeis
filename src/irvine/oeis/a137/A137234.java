package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137234 Expansion of g.f. 1/((1-x)^2*(1 - 3*x + 2*x^2 - x^3)).
 * @author Sean A. Irvine
 */
public class A137234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137234() {
    super(new long[] {1, -4, 8, -9, 5}, new long[] {1, 5, 16, 43, 107});
  }
}
