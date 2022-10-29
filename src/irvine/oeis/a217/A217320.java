package irvine.oeis.a217;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A217320 Numbers n such that (13^n - 2^n)/11 is prime.
 * @author Georg Fischer
 */
public class A217320 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A217320() {
    super("[[0],[-26],[15],[-1]]", "[0, 11]", 0, primeDivTest(11));
  }

}
