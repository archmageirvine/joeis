package irvine.oeis.a343;
// manually prisuba at 2023-02-14 11:26

import irvine.oeis.a025.A025281;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A343197 Numbers k such that A025281(k) is prime.
 * @author Georg Fischer
 */
public class A343197 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A343197() {
    super(new A025281(), 0);
  }

}
