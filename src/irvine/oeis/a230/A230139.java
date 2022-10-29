package irvine.oeis.a230;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A230139 Numbers n such that (17^n - 4^n)/13 is prime.
 * @author Georg Fischer
 */
public class A230139 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A230139() {
    super("[[0],[-68],[21],[-1]]", "[0, 13]", 0, primeDivTest(13));
  }

}
