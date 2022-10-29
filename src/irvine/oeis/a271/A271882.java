package irvine.oeis.a271;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A271882 Numbers n such that (10^n + 101)/3 is prime.
 * @author Georg Fischer
 */
public class A271882 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A271882() {
    super("[[-909],[10],[-1]]", "[102, 111]", 0, primeDivTest(Z.THREE));
  }

}
