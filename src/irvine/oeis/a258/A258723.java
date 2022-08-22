package irvine.oeis.a258;
// manually 2022-08-22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A258723 Expansion of 1/(1-12*x+48*x^2)^(1/2).
 * Recurrence: n*a(n) +6*(-2*n+1)*a(n-1) +48*(n-1)*a(n-2)=0.
 * @author Georg Fischer
 */
public class A258723 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A258723() {
    super(0, "[[0],[-48, 48],[6,-12],[0, 1]]", "1", 0);
  }
}
