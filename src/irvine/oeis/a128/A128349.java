package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128349 Numbers k such that (13^k - 5^k)/8 is prime.
 * @author Georg Fischer
 */
public class A128349 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128349() {
    super("[[0],[-65],[18],[-1]]", "[0, 8]", 0, primeDivTest(Z.EIGHT));
  }

}
