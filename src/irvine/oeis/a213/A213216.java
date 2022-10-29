package irvine.oeis.a213;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A213216 Numbers n such that (12^n + 11^n)/23 is prime.
 * @author Georg Fischer
 */
public class A213216 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A213216() {
    super("[[0],[-132],[23],[-1]]", "[2, 23]", 0, primeDivTest(23));
  }

}
