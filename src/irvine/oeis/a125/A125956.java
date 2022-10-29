package irvine.oeis.a125;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A125956 Numbers k such that (2^k + 9^k)/11 is prime.
 * @author Georg Fischer
 */
public class A125956 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A125956() {
    super("[[0],[-18],[11],[-1]]", "[2, 11]", 0, primeDivTest(11));
  }

}
