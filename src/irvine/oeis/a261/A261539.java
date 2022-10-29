package irvine.oeis.a261;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A261539 Numbers m such that (4^m + 5) / 3  is prime.
 * @author Georg Fischer
 */
public class A261539 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A261539() {
    super("[[-15],[4],[-1]]", "[6, 9]", 0, primeDivTest(Z.THREE));
  }

}
