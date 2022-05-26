package irvine.oeis.a057;

import irvine.oeis.PrependSequence;
import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A057220 Numbers k such that 2^k - 23 is prime.
 * @author Sean A. Irvine
 */
public class A057220 extends PrependSequence {

  /** Construct the sequence. */
  public A057220() {
    super(new PowerFactorPrimeSequence(1, 1, 1, 2, -23), 2, 4);
  }
}
