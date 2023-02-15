package irvine.oeis.a352;
// manually prisuba at 2023-02-14 11:26

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A352997 Numbers k such that A352996(k) is prime.
 * @author Georg Fischer
 */
public class A352997 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A352997() {
    super(new A352996(), 2);
  }

}
