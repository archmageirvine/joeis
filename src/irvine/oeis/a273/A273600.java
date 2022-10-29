package irvine.oeis.a273;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A273600 Numbers n such that (11^n - 8^n)/3 is prime.
 * @author Georg Fischer
 */
public class A273600 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A273600() {
    super("[[0],[-88],[19],[-1]]", "[0, 3]", 0, primeDivTest(Z.THREE));
  }

}
