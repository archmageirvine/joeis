package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128066 Numbers k such that (3^k + 4^k)/7 is prime.
 * @author Georg Fischer
 */
public class A128066 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128066() {
    super("[[0],[-12],[7],[-1]]", "[2, 7]", 0, primeDivTest(Z.SEVEN));
  }

}
