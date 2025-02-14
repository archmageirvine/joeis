package irvine.oeis.a360;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360416 a(n) = 8*n^2 - 9*n + 3.
 * @author Georg Fischer
 */
public class A360416 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360416() {
    super(0, "[0,1,-3,3,-1]", "3,2,17,48,95,158,237,332,443", 0);
  }
}
