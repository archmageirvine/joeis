package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057182 Numbers n such that (16^n + 1)/17 is a prime.
 * @author Georg Fischer
 */
public class A057182 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057182() {
    super("[[-15],[16],[-1]]", "[2, 17]", 0, primeDivTest(17));
  }

}
