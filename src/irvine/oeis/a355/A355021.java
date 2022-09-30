package irvine.oeis.a355;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355021 a(n) = (-1)^n * L(n) - 1, where L = A000032 (Lucas numbers).
 * @author Georg Fischer
 */
public class A355021 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355021() {
    super(0, "[0,-1,2,0,-1]", "1,-2", 0);
  }
}
