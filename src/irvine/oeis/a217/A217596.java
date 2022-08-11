package irvine.oeis.a217;
// manually rectoproc/holos at 2022-08-11 09:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A217596 G.f.: x / reversion(x - x^2 - x^3).
 * @author Georg Fischer
 */
public class A217596 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A217596() {
    super(0, "[[0],[-840, 1347,-675, 108],[-300, 630,-418, 88],[0,-45, 65,-20]]", "1,-1,-2", 0);
  }
}
