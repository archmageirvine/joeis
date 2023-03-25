package irvine.oeis.a227;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A227173 Numbers k such that (138^k + 137^k)/275 is prime.
 * @author Georg Fischer
 */
public class A227173 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A227173() {
    super("[[0],[-18906],[275],[-1]]", "[2, 275]", 0, primeDivTest(275));
  }

}
