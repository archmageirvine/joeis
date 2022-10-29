package irvine.oeis.a221;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A221637 Numbers n such that (15^n + 14^n)/29 is prime.
 * @author Georg Fischer
 */
public class A221637 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A221637() {
    super("[[0],[-210],[29],[-1]]", "[2, 29]", 0, primeDivTest(29));
  }

}
