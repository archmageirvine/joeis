package irvine.oeis.a231;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A231329 Numbers n such that (19^n + 4^n)/23 is prime.
 * @author Georg Fischer
 */
public class A231329 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A231329() {
    super("[[0],[-76],[23],[-1]]", "[2, 23]", 0, primeDivTest(23));
  }

}
