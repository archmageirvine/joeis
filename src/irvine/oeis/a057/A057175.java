package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057175 Numbers n such that (9^n + 1)/10 is a prime.
 * @author Georg Fischer
 */
public class A057175 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057175() {
    super("[[-8],[9],[-1]]", "[2, 10]", 0, primeDivTest(Z.TEN));
  }

}
