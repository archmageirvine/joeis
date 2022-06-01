package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088015 Expansion of e.g.f. cosh(sqrt(2)*x) + exp(x)*(cosh(sqrt(2*x) - 1).
 * @author Sean A. Irvine
 */
public class A088015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088015() {
    super(new long[] {2, 2, -7, 1, 3}, new long[] {1, 0, 4, 6, 20});
  }
}
