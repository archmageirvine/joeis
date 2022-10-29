package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A063679 Numbers k such that (3^k - 7)/2 is prime.
 * @author Georg Fischer
 */
public class A063679 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A063679() {
    super("[[14],[3],[-1]]", "[-6,-4]", 0, primeDivTest(Z.TWO));
  }

}
