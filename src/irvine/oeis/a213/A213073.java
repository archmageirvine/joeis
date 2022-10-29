package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A213073 Numbers n such that (7^n - 4^n)/3 is prime.
 * @author Georg Fischer
 */
public class A213073 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A213073() {
    super("[[0],[-28],[11],[-1]]", "[0, 3]", 0, primeDivTest(Z.THREE));
  }

}
