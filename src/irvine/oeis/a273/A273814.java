package irvine.oeis.a273;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A273814 Numbers k such that (12^k - 7^k)/5 is prime.
 * @author Georg Fischer
 */
public class A273814 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A273814() {
    super("[[0],[-84],[19],[-1]]", "[0, 5]", 0, primeDivTest(Z.FIVE));
  }

}
