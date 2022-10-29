package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057179 Numbers n such that (13^n + 1)/14 is a prime.
 * @author Georg Fischer
 */
public class A057179 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057179() {
    super("[[-12],[13],[-1]]", "[2, 14]", 0, primeDivTest(14));
  }

}
