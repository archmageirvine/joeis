package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128346 Numbers k such that (9^k - 5^k)/4 is prime.
 * @author Georg Fischer
 */
public class A128346 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128346() {
    super("[[0],[-45],[14],[-1]]", "[0, 4]", 0, primeDivTest(Z.FOUR));
  }

}
