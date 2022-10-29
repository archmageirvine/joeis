package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A293272 Numbers k such that (10^k - 19)/9 is prime.
 * @author Georg Fischer
 */
public class A293272 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A293272() {
    super("[[171],[10],[-1]]", "[-18,-9]", 0, primeDivTest(Z.NINE));
  }

}
