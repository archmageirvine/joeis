package irvine.oeis.a127;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A127995 Numbers k such that (20^k - 1)/19 is prime.
 * @author Georg Fischer
 */
public class A127995 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A127995() {
    super("[[19],[20],[-1]]", "[0, 19]", 0, primeDivTest(19));
  }

}
