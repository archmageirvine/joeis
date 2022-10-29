package irvine.oeis.a228;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A228076 Numbers k such that (19^k - 4^k)/15 is prime.
 * @author Georg Fischer
 */
public class A228076 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A228076() {
    super("[[0],[-76],[23],[-1]]", "[0, 15]", 0, primeDivTest(15));
  }

}
