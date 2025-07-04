package irvine.oeis.a227;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A227172 Numbers k such that (48^k + 47^k)/95 is prime.
 * @author Georg Fischer
 */
public class A227172 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A227172() {
    super("[[0],[-2256],[95],[-1]]", "[2, 95]", 0, primeDivTest(95));
  }

}
