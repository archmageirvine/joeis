package irvine.oeis.a224;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A224984 Numbers n such that (14^n + 13^n)/27 is prime.
 * @author Georg Fischer
 */
public class A224984 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A224984() {
    super("[[0],[-182],[27],[-1]]", "[2, 27]", 0, primeDivTest(27));
  }

}
