package irvine.oeis.a248;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A248814 a(n) = (6n)!/(6!^n).
 * @author Georg Fischer
 */
public class A248814 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A248814() {
    super(0, "[[0],[0,-120, 1644,-8100, 18360,-19440, 7776],[-120]]", "[1]", 0);
    // seq(coeff(expand((6*n-5)*(6*n-4)*(6*n-3)*(6*n-2)*(6*n-1)*n),n,j),j=0..6);
  }
}
