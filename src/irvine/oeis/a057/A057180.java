package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057180 Numbers n such that (14^n + 1)/15 is a prime.
 * @author Georg Fischer
 */
public class A057180 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057180() {
    super("[[-13],[14],[-1]]", "[2, 15]", 0, primeDivTest(15));
  }

}
