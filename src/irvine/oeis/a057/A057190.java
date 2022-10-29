package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057190 Numbers n such that (24^n+1)/25 is a prime.
 * @author Georg Fischer
 */
public class A057190 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057190() {
    super("[[-23],[24],[-1]]", "[2, 25]", 0, primeDivTest(25));
  }

}
