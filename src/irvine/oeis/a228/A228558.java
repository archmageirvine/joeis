package irvine.oeis.a228;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A228558 Numbers k such that (17^k + 4^k)/21 is prime.
 * @author Georg Fischer
 */
public class A228558 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A228558() {
    super("[[0],[-68],[21],[-1]]", "[2, 21]", 0, primeDivTest(21));
  }

}
