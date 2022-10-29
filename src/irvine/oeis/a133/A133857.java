package irvine.oeis.a133;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A133857 Numbers k such that (18^k - 1)/17 is prime.
 * @author Georg Fischer
 */
public class A133857 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A133857() {
    super("[[17],[18],[-1]]", "[0, 17]", 0, primeDivTest(17));
  }

}
