package irvine.oeis.a224;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A224507 Numbers k such that (17^k + 2^k)/19 is prime.
 * @author Georg Fischer
 */
public class A224507 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A224507() {
    super("[[0],[-34],[19],[-1]]", "[2, 19]", 0, primeDivTest(19));
  }

}
