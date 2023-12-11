package irvine.oeis.a030;

import irvine.oeis.a008.A008578;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A030014 Inverse Moebius transform of {1, primes}.
 * @author Sean A. Irvine
 */
public class A030014 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A030014() {
    super(new A008578(), 0);
    next();
  }
}
