package irvine.oeis.a127;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A127999 Numbers n such that (26^n - 1)/25 is prime.
 * @author Georg Fischer
 */
public class A127999 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A127999() {
    super("[[25],[26],[-1]]", "[0, 25]", 0, primeDivTest(25));
  }

}
