package irvine.oeis.a227;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A227171 Numbers n such that (18^n + 17^n)/35 is prime.
 * @author Georg Fischer
 */
public class A227171 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A227171() {
    super("[[0],[-306],[35],[-1]]", "[2, 35]", 0, primeDivTest(35));
  }

}
