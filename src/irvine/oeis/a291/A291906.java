package irvine.oeis.a291;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A291906 Numbers k such that (29^k + 1)/30 is a prime.
 * @author Georg Fischer
 */
public class A291906 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A291906() {
    super("[[-28],[29],[-1]]", "[2, 30]", 0, primeDivTest(30));
  }

}
