package irvine.oeis.a294;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A294909 Numbers k such that (10^k + 47)/3 is prime.
 * @author Georg Fischer
 */
public class A294909 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A294909() {
    super("[[-423],[10],[-1]]", "[48, 57]", 0, primeDivTest(Z.THREE));
  }

}
