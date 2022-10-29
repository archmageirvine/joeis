package irvine.oeis.a071;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A071381 Numbers n such that (28^n+1)/29 is a prime.
 * @author Georg Fischer
 */
public class A071381 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A071381() {
    super("[[-27],[28],[-1]]", "[2, 29]", 0, primeDivTest(29));
  }

}
