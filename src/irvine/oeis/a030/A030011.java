package irvine.oeis.a030;

import irvine.oeis.a008.A008578;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A030011 Inverse Euler transform of {1, primes}.
 * @author Sean A. Irvine
 */
public class A030011 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A030011() {
    super(1, new A008578(), 0);
    next();
  }
}
