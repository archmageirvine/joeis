package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128000 Numbers n such that (28^n - 1)/27 is prime.
 * @author Georg Fischer
 */
public class A128000 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128000() {
    super("[[27],[28],[-1]]", "[0, 27]", 0, primeDivTest(27));
  }

}
