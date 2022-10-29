package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057187 Numbers n such that (21^n+1)/22 is a prime.
 * @author Georg Fischer
 */
public class A057187 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057187() {
    super("[[-20],[21],[-1]]", "[2, 22]", 0, primeDivTest(22));
  }

}
