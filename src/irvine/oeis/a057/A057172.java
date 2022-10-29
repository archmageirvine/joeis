package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057172 Numbers n such that (6^n + 1)/7 is a prime.
 * @author Georg Fischer
 */
public class A057172 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057172() {
    super("[[-5],[6],[-1]]", "[2, 7]", 0, primeDivTest(Z.SEVEN));
  }

}
