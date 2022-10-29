package irvine.oeis.a181;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A181979 Numbers n such that (29^n - 1)/28 is prime.
 * @author Georg Fischer
 */
public class A181979 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A181979() {
    super("[[28],[29],[-1]]", "[0, 28]", 0, primeDivTest(28));
  }

}
