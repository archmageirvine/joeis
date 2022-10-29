package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057178 Numbers k such that (12^k + 1)/13 is a prime.
 * @author Georg Fischer
 */
public class A057178 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057178() {
    super("[[-11],[12],[-1]]", "[2, 13]", 0, primeDivTest(13));
  }

}
