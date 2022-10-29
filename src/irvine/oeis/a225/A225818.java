package irvine.oeis.a225;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A225818 Numbers n such that (19^n + 18^n)/37 is prime.
 * @author Georg Fischer
 */
public class A225818 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A225818() {
    super("[[0],[-342],[37],[-1]]", "[2, 37]", 0, primeDivTest(37));
  }

}
