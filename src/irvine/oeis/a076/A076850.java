package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A076850 Numbers k such that (10^k + 2)/6 is prime.
 * @author Georg Fischer
 */
public class A076850 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A076850() {
    super("[[-18],[10],[-1]]", "[3, 12]", 0, primeDivTest(Z.SIX));
  }

}
