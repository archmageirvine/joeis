package irvine.oeis.a281;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A281493 Numbers k such that (10^k + 41)/3 is prime.
 * @author Georg Fischer
 */
public class A281493 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A281493() {
    super("[[-369],[10],[-1]]", "[42, 51]", 0, primeDivTest(Z.THREE));
  }

}
