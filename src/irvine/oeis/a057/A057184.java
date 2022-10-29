package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057184 Numbers n such that (18^n + 1)/19 is a prime.
 * @author Georg Fischer
 */
public class A057184 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057184() {
    super("[[-17],[18],[-1]]", "[2, 19]", 0, primeDivTest(19));
  }

}
