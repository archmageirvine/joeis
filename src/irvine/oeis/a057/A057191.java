package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057191 Numbers n such that (25^n+1)/26 is a prime.
 * @author Georg Fischer
 */
public class A057191 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057191() {
    super("[[-24],[25],[-1]]", "[2, 26]", 0, primeDivTest(26));
  }

}
