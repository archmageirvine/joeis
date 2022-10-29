package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128002 Numbers n such that (31^n - 1)/30 is prime.
 * @author Georg Fischer
 */
public class A128002 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128002() {
    super("[[30],[31],[-1]]", "[0, 30]", 0, primeDivTest(30));
  }

}
