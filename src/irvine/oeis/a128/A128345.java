package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128345 Numbers k such that (8^k - 5^k)/3 is prime.
 * @author Georg Fischer
 */
public class A128345 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128345() {
    super("[[0],[-40],[13],[-1]]", "[0, 3]", 0, primeDivTest(Z.THREE));
  }

}
