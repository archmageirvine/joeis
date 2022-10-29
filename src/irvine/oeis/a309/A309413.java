package irvine.oeis.a309;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A309413 Numbers k such that (50^k + 1)/51 is prime.
 * @author Georg Fischer
 */
public class A309413 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A309413() {
    super("[[-49],[50],[-1]]", "[2, 51]", 0, primeDivTest(51));
  }

}
