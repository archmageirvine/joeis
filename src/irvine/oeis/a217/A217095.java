package irvine.oeis.a217;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A217095 Numbers n such that (10^n + 9^n)/19 is prime.
 * @author Georg Fischer
 */
public class A217095 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A217095() {
    super("[[0],[-90],[19],[-1]]", "[2, 19]", 0, primeDivTest(19));
  }

}
