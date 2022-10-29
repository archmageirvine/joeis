package irvine.oeis.a273;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A273403 Numbers n such that (10^n - 7^n)/3 is prime.
 * @author Georg Fischer
 */
public class A273403 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A273403() {
    super("[[0],[-70],[17],[-1]]", "[0, 3]", 0, primeDivTest(Z.THREE));
  }

}
