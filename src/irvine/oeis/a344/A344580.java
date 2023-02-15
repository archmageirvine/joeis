package irvine.oeis.a344;
// manually prisuba at 2023-02-14 11:26

import irvine.oeis.a101.A101203;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A344580 Numbers k such that A101203(k) is prime.
 * @author Georg Fischer
 */
public class A344580 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A344580() {
    super(new A101203(), 0);
  }

}
