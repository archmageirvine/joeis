package irvine.oeis.a187;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A187805 Numbers n such that (7^n + 6^n)/13 is prime.
 * @author Georg Fischer
 */
public class A187805 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A187805() {
    super("[[0],[-42],[13],[-1]]", "[2, 13]", 0, primeDivTest(13));
  }

}
