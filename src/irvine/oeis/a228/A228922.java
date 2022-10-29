package irvine.oeis.a228;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A228922 Numbers n such that (19^n + 2^n)/21 is prime.
 * @author Georg Fischer
 */
public class A228922 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A228922() {
    super("[[0],[-38],[21],[-1]]", "[2, 21]", 0, primeDivTest(21));
  }

}
