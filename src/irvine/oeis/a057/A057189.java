package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057189 Numbers n such that (23^n+1)/24 is a prime.
 * @author Georg Fischer
 */
public class A057189 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057189() {
    super("[[-22],[23],[-1]]", "[2, 24]", 0, primeDivTest(24));
  }

}
