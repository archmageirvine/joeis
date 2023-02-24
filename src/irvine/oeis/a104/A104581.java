package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104581 Expansion of g.f. 1/(1 + x + x^3 + x^4).
 * @author Sean A. Irvine
 */
public class A104581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104581() {
    super(new long[] {-1, -1, 0, -1}, new long[] {1, -1, 1, -2});
  }
}
