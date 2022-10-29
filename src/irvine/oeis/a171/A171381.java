package irvine.oeis.a171;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A171381 Numbers k such that (3^k + 1)/2 is prime.
 * @author Georg Fischer
 */
public class A171381 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A171381() {
    super("[[-2],[3],[-1]]", "[2, 4]", 0, primeDivTest(Z.TWO));
  }

}
