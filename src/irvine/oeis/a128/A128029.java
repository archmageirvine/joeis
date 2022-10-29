package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128029 Numbers n such that (14^n - 3^n)/11 is prime.
 * @author Georg Fischer
 */
public class A128029 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128029() {
    super("[[0],[-42],[17],[-1]]", "[0, 11]", 0, primeDivTest(11));
  }

}
