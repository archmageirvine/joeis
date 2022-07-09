package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104237 Expansion of (1 - x + x^2)*(1 + x + x^2 - x^3 + 2*x^4)/((1 - x)*(1 + x)^2*(1 + x^2)*(1 + x - x^2 + x^3)).
 * @author Sean A. Irvine
 */
public class A104237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104237() {
    super(new long[] {1, 0, 0, 2, 0, 0, 0, -2}, new long[] {1, -2, 5, -11, 26, -53, 104, -198});
  }
}
