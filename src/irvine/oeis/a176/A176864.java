package irvine.oeis.a176;
// manually prisuba at 2023-02-14 11:26

import irvine.oeis.a053.A053186;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A176864 Numbers k such that A053186(k) is prime.
 * @author Georg Fischer
 */
public class A176864 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A176864() {
    super(new A053186(), 0);
  }

}
