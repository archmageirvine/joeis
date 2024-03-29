package irvine.oeis.a053;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A053133 One half of binomial coefficients binomial(2*n-8,9).
 * @author Georg Fischer
 */
public class A053133 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A053133() {
    super(9, "[0, 1,-10, 45,-120, 210,-252, 210,-120, 45,-10, 1]", "[5, 110, 1001, 5720, 24310, 83980, 248710, 653752, 1562275, 3453450]", 0);
  }
}
