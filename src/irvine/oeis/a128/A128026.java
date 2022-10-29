package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128026 Numbers n such that (10^n - 3^n)/7 is prime.
 * @author Georg Fischer
 */
public class A128026 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128026() {
    super("[[0],[-30],[13],[-1]]", "[0, 7]", 0, primeDivTest(Z.SEVEN));
  }

}
