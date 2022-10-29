package irvine.oeis.a224;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A224691 Numbers n such that (13^n - 4^n)/9 is prime.
 * @author Georg Fischer
 */
public class A224691 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A224691() {
    super("[[0],[-52],[17],[-1]]", "[0, 9]", 0, primeDivTest(Z.NINE));
  }

}
