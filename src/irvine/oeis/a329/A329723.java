package irvine.oeis.a329;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329723 Coefficients of expansion of (1-2x^3)/(1-x-x^2) in powers of x.
 * @author Georg Fischer
 */
public class A329723 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329723() {
    super(0, "[0,1,1,-1]", "1,1,2,1", 0);
  }
}
