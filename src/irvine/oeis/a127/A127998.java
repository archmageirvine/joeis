package irvine.oeis.a127;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A127998 Numbers n such that (24^n - 1)/23 is prime.
 * @author Georg Fischer
 */
public class A127998 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A127998() {
    super("[[23],[24],[-1]]", "[0, 23]", 0, primeDivTest(23));
  }

}
