package irvine.oeis.a030;

import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.a008.A008578;

/**
 * A030014 Inverse Moebius transform of <code>{1</code>, primes}.
 * @author Sean A. Irvine
 */
public class A030014 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A030014() {
    super(new A008578(), 0);
    next();
  }
}
