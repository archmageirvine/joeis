package irvine.oeis.a273;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A273010 Numbers n such that (9^n - 7^n)/2 is prime.
 * @author Georg Fischer
 */
public class A273010 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A273010() {
    super("[[0],[-63],[16],[-1]]", "[0, 2]", 0, primeDivTest(Z.TWO));
  }

}
