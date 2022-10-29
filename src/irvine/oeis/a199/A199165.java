package irvine.oeis.a199;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A199165 Numbers n such that (6^n-11)/5 is prime.
 * @author Georg Fischer
 */
public class A199165 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A199165() {
    super("[[55],[6],[-1]]", "[-10,-5]", 0, primeDivTest(Z.FIVE));
  }

}
