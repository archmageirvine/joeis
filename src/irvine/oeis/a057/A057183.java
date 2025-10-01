package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057183 Numbers k such that (17^k + 1)/18 is a prime.
 * @author Georg Fischer
 */
public class A057183 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057183() {
    super("[[-16],[17],[-1]]", "[2, 18]", 0, primeDivTest(18));
  }

}
