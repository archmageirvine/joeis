package irvine.oeis.a071;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A071382 Numbers n such that (30^n+1)/31 is a prime.
 * @author Georg Fischer
 */
public class A071382 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A071382() {
    super("[[-29],[30],[-1]]", "[2, 31]", 0, primeDivTest(31));
  }

}
