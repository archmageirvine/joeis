package irvine.oeis.a273;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A273598 Numbers k such that (11^k - 6^k)/5 is prime.
 * @author Georg Fischer
 */
public class A273598 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A273598() {
    super("[[0],[-66],[17],[-1]]", "[0, 5]", 0, primeDivTest(Z.FIVE));
  }

}
