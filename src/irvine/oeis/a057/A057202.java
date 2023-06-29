package irvine.oeis.a057;

import irvine.oeis.PrependSequence;
import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A057202 Numbers n such that 2^n - 21 is prime.
 * @author Sean A. Irvine
 */
public class A057202 extends PrependSequence {

  /** Construct the sequence. */
  public A057202() {
    super(1, new PowerFactorPrimeSequence(1, 1, 1, 2, -21), 1, 2, 3, 4);
  }
}
