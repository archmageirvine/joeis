package irvine.oeis.a273;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A273599 Numbers k such that (11^k - 7^k)/4 is prime.
 * @author Georg Fischer
 */
public class A273599 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A273599() {
    super("[[0],[-77],[18],[-1]]", "[0, 4]", 0, primeDivTest(Z.FOUR));
  }

}
