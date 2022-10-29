package irvine.oeis.a210;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A210506 Numbers k such that (11^k - 2^k)/9 is prime.
 * @author Georg Fischer
 */
public class A210506 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A210506() {
    super("[[0],[-22],[13],[-1]]", "[0, 9]", 0, primeDivTest(Z.NINE));
  }

}
