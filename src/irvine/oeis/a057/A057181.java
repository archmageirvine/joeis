package irvine.oeis.a057;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A057181 Numbers n such that (15^n + 1)/16 is a prime.
 * @author Georg Fischer
 */
public class A057181 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A057181() {
    super("[[-14],[15],[-1]]", "[2, 16]", 0, primeDivTest(16));
  }

}
