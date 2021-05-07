package irvine.oeis.a172;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A172613 a(n) = (9n)!/(9!^n).
 * @author Georg Fischer
 */
public class A172613 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A172613() {
    super(0, "[[0],[0, 40320,-986256, 9568044,-49050036, 147287889,-267846264, 290166786,-172186884, 43046721],[-40320]]", "[1]", 0);
    // seq(coeff(expand((9*n-8)*(9*n-7)*(9*n-6)*(9*n-5)*(9*n-4)*(9*n-3)*(9*n-2)*(9*n-1)*n),n,j),j=0..9);
  }
}
