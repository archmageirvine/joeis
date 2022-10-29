package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A082387 Numbers k such that (5^k + 2^k)/7 is prime.
 * @author Georg Fischer
 */
public class A082387 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A082387() {
    super("[[0],[-10],[7],[-1]]", "[2, 7]", 0, primeDivTest(Z.SEVEN));
  }

}
