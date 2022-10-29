package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128347 Numbers k such that (11^k - 5^k)/6 is prime.
 * @author Georg Fischer
 */
public class A128347 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128347() {
    super("[[0],[-55],[16],[-1]]", "[0, 6]", 0, primeDivTest(Z.SIX));
  }

}
