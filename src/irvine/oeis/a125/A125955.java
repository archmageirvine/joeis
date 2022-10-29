package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A125955 Numbers k such that (2^k + 7^k)/9 is prime.
 * @author Georg Fischer
 */
public class A125955 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A125955() {
    super("[[0],[-14],[9],[-1]]", "[2, 9]", 0, primeDivTest(Z.NINE));
  }

}
