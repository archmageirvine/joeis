package irvine.oeis.a261;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A261578 Numbers m such that (4^m + 17) / 3 is prime.
 * @author Georg Fischer
 */
public class A261578 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A261578() {
    super("[[-51],[4],[-1]]", "[18, 21]", 0, primeDivTest(Z.THREE));
  }

}
