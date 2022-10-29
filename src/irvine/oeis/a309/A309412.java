package irvine.oeis.a309;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A309412 Numbers k such that (45^k + 1)/46 is prime.
 * @author Georg Fischer
 */
public class A309412 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A309412() {
    super("[[-44],[45],[-1]]", "[2, 46]", 0, primeDivTest(46));
  }

}
