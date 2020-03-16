package irvine.oeis.a030;

import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a000.A000040;

/**
 * A030010 Inverse Euler transform of primes.
 * @author Sean A. Irvine
 */
public class A030010 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A030010() {
    super(new A000040(), 0);
    next();
  }
}
