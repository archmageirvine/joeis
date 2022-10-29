package irvine.oeis.a284;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A284285 Numbers k such that (2^k + 3)/5 is prime.
 * @author Georg Fischer
 */
public class A284285 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A284285() {
    super("[[-3],[2],[-1]]", "[4, 5]", 0, primeDivTest(Z.FIVE));
  }

}
