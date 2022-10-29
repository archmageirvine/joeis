package irvine.oeis.a301;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A301369 Numbers k such that (9^k + 7^k)/16 is prime.
 * @author Georg Fischer
 */
public class A301369 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A301369() {
    super("[[0],[-63],[16],[-1]]", "[2, 16]", 0, primeDivTest(16));
  }

}
