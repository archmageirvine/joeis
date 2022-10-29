package irvine.oeis.a294;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A294916 Numbers k such that (10^k + 191)/3 is prime.
 * @author Georg Fischer
 */
public class A294916 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A294916() {
    super("[[-1719],[10],[-1]]", "[192, 201]", 0, primeDivTest(Z.THREE));
  }

}
