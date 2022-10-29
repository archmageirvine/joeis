package irvine.oeis.a274;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A274986 Numbers k such that (10^k + 23)/3 is prime.
 * @author Georg Fischer
 */
public class A274986 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A274986() {
    super("[[-207],[10],[-1]]", "[24, 33]", 0, primeDivTest(Z.THREE));
  }

}
