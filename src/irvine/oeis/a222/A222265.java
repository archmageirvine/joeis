package irvine.oeis.a222;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A222265 Numbers n such that (13^n + 2^n)/15 is prime.
 * @author Georg Fischer
 */
public class A222265 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A222265() {
    super("[[0],[-26],[15],[-1]]", "[2, 15]", 0, primeDivTest(15));
  }

}
