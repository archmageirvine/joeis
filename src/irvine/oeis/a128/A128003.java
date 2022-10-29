package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128003 Numbers n such that (37^n - 1)/36 is prime.
 * @author Georg Fischer
 */
public class A128003 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128003() {
    super("[[36],[37],[-1]]", "[0, 36]", 0, primeDivTest(36));
  }

}
