package irvine.oeis.a273;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A273009 Numbers k such that (2^k + 5) / 3 is prime.
 * @author Georg Fischer
 */
public class A273009 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A273009() {
    super("[[-5],[2],[-1]]", "[6, 7]", 0, primeDivTest(Z.THREE));
  }

}
