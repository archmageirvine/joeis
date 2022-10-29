package irvine.oeis.a227;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A227170 Numbers n such that (16^n + 15^n)/31 is prime.
 * @author Georg Fischer
 */
public class A227170 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A227170() {
    super("[[0],[-240],[31],[-1]]", "[2, 31]", 0, primeDivTest(31));
  }

}
