package irvine.oeis.a231;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A231865 Numbers n such that (43^n + 1)/44 is prime.
 * @author Georg Fischer
 */
public class A231865 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A231865() {
    super("[[-42],[43],[-1]]", "[2, 44]", 0, primeDivTest(44));
  }

}
