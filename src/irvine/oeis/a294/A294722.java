package irvine.oeis.a294;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A294722 Numbers n such that (44^n - 1)/43 is prime.
 * @author Georg Fischer
 */
public class A294722 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A294722() {
    super("[[43],[44],[-1]]", "[0, 43]", 0, primeDivTest(43));
  }

}
