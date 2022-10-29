package irvine.oeis.a185;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A185239 Numbers n such that (11^n + 10^n)/21 is prime.
 * @author Georg Fischer
 */
public class A185239 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A185239() {
    super("[[0],[-110],[21],[-1]]", "[2, 21]", 0, primeDivTest(21));
  }

}
