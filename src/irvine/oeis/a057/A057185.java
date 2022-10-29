package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057185 Numbers n such that (19^n + 1)/20 is a prime.
 * @author Georg Fischer
 */
public class A057185 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057185() {
    super("[[-18],[19],[-1]]", "[2, 20]", 0, primeDivTest(20));
  }

}
