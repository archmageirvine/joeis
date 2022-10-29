package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A293853 Numbers k such that (10^k - 79)/3 is prime.
 * @author Georg Fischer
 */
public class A293853 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A293853() {
    super("[[711],[10],[-1]]", "[-78,-69]", 0, primeDivTest(Z.THREE));
  }

}
