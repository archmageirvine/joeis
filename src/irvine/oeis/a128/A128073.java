package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128073 Numbers k such that (3^k + 16^k)/19 is prime.
 * @author Georg Fischer
 */
public class A128073 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128073() {
    super("[[0],[-48],[19],[-1]]", "[2, 19]", 0, primeDivTest(19));
  }

}
