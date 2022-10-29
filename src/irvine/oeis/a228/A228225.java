package irvine.oeis.a228;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A228225 Numbers n such that (17^n + 3^n)/20 is prime.
 * @author Georg Fischer
 */
public class A228225 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A228225() {
    super("[[0],[-51],[20],[-1]]", "[2, 20]", 0, primeDivTest(20));
  }

}
