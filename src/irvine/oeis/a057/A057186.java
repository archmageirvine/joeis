package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057186 Numbers n such that (20^n+1)/21 is a prime.
 * @author Georg Fischer
 */
public class A057186 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057186() {
    super("[[-19],[20],[-1]]", "[2, 21]", 0, primeDivTest(21));
  }

}
