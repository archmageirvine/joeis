package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057173 Numbers n such that (7^n + 1)/8 is a prime.
 * @author Georg Fischer
 */
public class A057173 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057173() {
    super("[[-6],[7],[-1]]", "[2, 8]", 0, primeDivTest(Z.EIGHT));
  }

}
