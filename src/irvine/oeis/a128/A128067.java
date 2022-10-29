package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128067 Numbers k such that (3^k + 7^k)/10 is prime.
 * @author Georg Fischer
 */
public class A128067 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128067() {
    super("[[0],[-21],[10],[-1]]", "[2, 10]", 0, primeDivTest(Z.TEN));
  }

}
