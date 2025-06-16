package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A215487 Numbers k such that (7^k - 2^k)/5 is prime.
 * @author Georg Fischer
 */
public class A215487 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A215487() {
    super("[[0],[-14],[9],[-1]]", "[0, 5]", 0, primeDivTest(Z.FIVE));
  }

}
