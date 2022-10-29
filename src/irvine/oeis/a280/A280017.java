package irvine.oeis.a280;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A280017 Numbers k such that (10^k - 13)/3 is prime.
 * @author Georg Fischer
 */
public class A280017 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A280017() {
    super("[[117],[10],[-1]]", "[-12,-3]", 0, primeDivTest(Z.THREE));
  }

}
