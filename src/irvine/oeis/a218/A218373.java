package irvine.oeis.a218;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A218373 Numbers n such that (7^n + 4^n)/11 is prime.
 * @author Georg Fischer
 */
public class A218373 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A218373() {
    super("[[0],[-28],[11],[-1]]", "[2, 11]", 0, primeDivTest(11));
  }

}
