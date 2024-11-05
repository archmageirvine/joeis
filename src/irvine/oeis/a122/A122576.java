package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122576 Expansion of g.f.: -x*(1 - 2*x + 6*x^2 - 2*x^3 + x^4)/((1-x)^3*(1+x)^4).
 * @author Sean A. Irvine
 */
public class A122576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122576() {
    super(1, new long[] {1, 1, -3, -3, 3, 3, -1}, new long[] {-1, 3, -12, 20, -45, 63, -112});
  }
}
