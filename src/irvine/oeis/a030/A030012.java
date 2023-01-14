package irvine.oeis.a030;

import irvine.oeis.a008.A008578;
import irvine.oeis.transform.EulerTransform;

/**
 * A030012 Euler transform of {1, primes}.
 * @author Sean A. Irvine
 */
public class A030012 extends EulerTransform {

  /** Construct the sequence. */
  public A030012() {
    super(new A008578(), 0);
    next();
  }
}
