package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A058960 Numbers k such that (3^k + 5)/2 is prime.
 * @author Georg Fischer
 */
public class A058960 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A058960() {
    super("[[-10],[3],[-1]]", "[6, 8]", 0, primeDivTest(Z.TWO));
  }

}
