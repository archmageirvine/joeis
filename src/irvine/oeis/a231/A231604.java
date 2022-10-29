package irvine.oeis.a231;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A231604 Numbers n such that (42^n + 1)/43 is prime.
 * @author Georg Fischer
 */
public class A231604 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A231604() {
    super("[[-41],[42],[-1]]", "[2, 43]", 0, primeDivTest(43));
  }

}
