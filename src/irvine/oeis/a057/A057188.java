package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057188 Numbers n such that (22^n+1)/23 is a prime.
 * @author Georg Fischer
 */
public class A057188 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057188() {
    super("[[-21],[22],[-1]]", "[2, 23]", 0, primeDivTest(23));
  }

}
