package irvine.oeis.a240;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A240765 Numbers n such that (43^n - 1)/42 is prime.
 * @author Georg Fischer
 */
public class A240765 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A240765() {
    super("[[42],[43],[-1]]", "[0, 42]", 0, primeDivTest(42));
  }

}
