package irvine.oeis.a127;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A127997 Numbers n such that (22^n - 1)/21 is prime.
 * @author Georg Fischer
 */
public class A127997 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A127997() {
    super("[[21],[22],[-1]]", "[0, 21]", 0, primeDivTest(21));
  }

}
