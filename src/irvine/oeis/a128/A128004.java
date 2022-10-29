package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128004 Numbers n such that (38^n - 1)/37 is prime.
 * @author Georg Fischer
 */
public class A128004 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128004() {
    super("[[37],[38],[-1]]", "[0, 37]", 0, primeDivTest(37));
  }

}
