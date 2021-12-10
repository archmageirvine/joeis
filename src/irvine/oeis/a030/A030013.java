package irvine.oeis.a030;

import irvine.oeis.transform.MobiusTransformSequence;
import irvine.oeis.a008.A008578;

/**
 * A030013 Moebius transform of {1, primes}.
 * @author Sean A. Irvine
 */
public class A030013 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A030013() {
    super(new A008578(), 0);
    next();
  }
}
