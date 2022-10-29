package irvine.oeis.a225;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A225807 Numbers n such that (17^n - 2^n)/15 is prime.
 * @author Georg Fischer
 */
public class A225807 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A225807() {
    super("[[0],[-34],[19],[-1]]", "[0, 15]", 0, primeDivTest(15));
  }

}
