package irvine.oeis.a344;
// manually prisuba at 2023-02-14 11:26

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A344424 Numbers k such that A344423(k) is prime.
 * @author Georg Fischer
 */
public class A344424 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A344424() {
    super(new A344423(), 0);
  }

}
