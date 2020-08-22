package irvine.oeis.a030;

import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a008.A008578;

/**
 * A030011 Inverse Euler transform of {1, primes}.
 * @author Sean A. Irvine
 */
public class A030011 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A030011() {
    super(new A008578(), 0);
    next();
  }
}
