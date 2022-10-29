package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128025 Numbers k such that (8^k - 3^k)/5 is prime.
 * @author Georg Fischer
 */
public class A128025 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128025() {
    super("[[0],[-24],[11],[-1]]", "[0, 5]", 0, primeDivTest(Z.FIVE));
  }

}
