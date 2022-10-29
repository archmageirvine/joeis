package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128350 Numbers k such that (14^k - 5^k)/9 is prime.
 * @author Georg Fischer
 */
public class A128350 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128350() {
    super("[[0],[-70],[19],[-1]]", "[0, 9]", 0, primeDivTest(Z.NINE));
  }

}
