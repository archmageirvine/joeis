package irvine.oeis.a261;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A261579 Numbers m such that (4^m + 23) / 3 is prime.
 * @author Georg Fischer
 */
public class A261579 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A261579() {
    super("[[-69],[4],[-1]]", "[24, 27]", 0, primeDivTest(Z.THREE));
  }

}
