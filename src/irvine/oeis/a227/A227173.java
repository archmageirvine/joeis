package irvine.oeis.a227;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A227173 Numbers n such that (138^n + 137^n)/275 is prime.
 * @author Georg Fischer
 */
public class A227173 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A227173() {
    super("[[0],[-18906],[275],[-1]]", "[2, 275]", 0, primeDivTest(275));
  }

}
