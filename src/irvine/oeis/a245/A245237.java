package irvine.oeis.a245;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A245237 Numbers k such that (48^k - 1)/47 is prime.
 * @author Georg Fischer
 */
public class A245237 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A245237() {
    super("[[47],[48],[-1]]", "[0, 47]", 0, primeDivTest(47));
  }

}
