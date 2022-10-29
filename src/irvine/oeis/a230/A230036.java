package irvine.oeis.a230;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A230036 Numbers n such that (39^n + 1)/40 is prime.
 * @author Georg Fischer
 */
public class A230036 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A230036() {
    super("[[-38],[39],[-1]]", "[2, 40]", 0, primeDivTest(40));
  }

}
