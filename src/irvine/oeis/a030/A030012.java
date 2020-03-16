package irvine.oeis.a030;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a008.A008578;

/**
 * A030012 Euler transform of <code>{1</code>, primes}.
 * @author Sean A. Irvine
 */
public class A030012 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A030012() {
    super(new A008578(), 0);
    next();
  }
}
