package irvine.oeis.a360;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360023 Expansion of e.g.f. x*exp(x)*(cosh(x))^2.
 * @author Georg Fischer
 */
public class A360023 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360023() {
    super(0, "[0,-9,6,17,-12,-7,6,-1]", "0,1,2,9,28,105", 0);
  }
}
