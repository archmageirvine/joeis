package irvine.oeis.a216;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A216181 Numbers n such that (11^n - 4^n)/7 is prime.
 * @author Georg Fischer
 */
public class A216181 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A216181() {
    super("[[0],[-44],[15],[-1]]", "[0, 7]", 0, primeDivTest(Z.SEVEN));
  }

}
