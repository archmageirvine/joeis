package irvine.oeis.a229;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A229612 Numbers n such that (19^n + 5^n)/24 is prime.
 * @author Georg Fischer
 */
public class A229612 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A229612() {
    super("[[0],[-95],[24],[-1]]", "[2, 24]", 0, primeDivTest(24));
  }

}
