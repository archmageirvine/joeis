package irvine.oeis.a334;
// manually dfinite/holos at 2022-07-30 10:17

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A334562 E.g.f.: exp(-(x + x^2 + x^3)).
 * @author Georg Fischer
 */
public class A334562 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A334562() {
    super(0, "[[0],[6,-9, 3],[-2, 2],[1],[1]]", "1", 0);
  }
}
