package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128024 Numbers n such that (7^n - 3^n)/4 is prime.
 * @author Georg Fischer
 */
public class A128024 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128024() {
    super("[[0],[-21],[10],[-1]]", "[0, 4]", 0, primeDivTest(Z.FOUR));
  }

}
