package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128348 Numbers k such that (12^k - 5^k)/7 is prime.
 * @author Georg Fischer
 */
public class A128348 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128348() {
    super("[[0],[-60],[17],[-1]]", "[0, 7]", 0, primeDivTest(Z.SEVEN));
  }

}
