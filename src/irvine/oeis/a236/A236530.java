package irvine.oeis.a236;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A236530 Numbers n such that (48^n + 1)/49 is prime.
 * @author Georg Fischer
 */
public class A236530 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A236530() {
    super("[[-47],[48],[-1]]", "[2, 49]", 0, primeDivTest(49));
  }

}
