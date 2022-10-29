package irvine.oeis.a071;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A071380 Numbers n such that (26^n+1)/27 is a prime.
 * @author Georg Fischer
 */
public class A071380 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A071380() {
    super("[[-25],[26],[-1]]", "[2, 27]", 0, primeDivTest(27));
  }

}
