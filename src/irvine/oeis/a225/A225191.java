package irvine.oeis.a225;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A225191 Numbers n such that (15^n + 2^n)/17 is prime.
 * @author Georg Fischer
 */
public class A225191 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A225191() {
    super("[[0],[-30],[17],[-1]]", "[2, 17]", 0, primeDivTest(17));
  }

}
