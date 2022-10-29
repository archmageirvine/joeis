package irvine.oeis.a127;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A127317 Numbers n such that (256^n + 1)/257 is prime.
 * @author Georg Fischer
 */
public class A127317 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A127317() {
    super("[[-255],[256],[-1]]", "[2, 257]", 0, primeDivTest(257));
  }

}
