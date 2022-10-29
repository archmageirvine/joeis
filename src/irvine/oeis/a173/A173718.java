package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A173718 Numbers n such that (9^n - 2^n)/7 is prime.
 * @author Georg Fischer
 */
public class A173718 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A173718() {
    super("[[0],[-18],[11],[-1]]", "[0, 7]", 0, primeDivTest(Z.SEVEN));
  }

}
