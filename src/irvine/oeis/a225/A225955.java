package irvine.oeis.a225;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A225955 Numbers n such that (15^n - 2^n)/13 is prime.
 * @author Georg Fischer
 */
public class A225955 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A225955() {
    super("[[0],[-30],[17],[-1]]", "[0, 13]", 0, primeDivTest(13));
  }

}
