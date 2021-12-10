package irvine.oeis.a007;

import irvine.oeis.transform.InverseMobiusTransformSequence;
import irvine.oeis.a000.A000040;

/**
 * A007445 Inverse Moebius transform of primes.
 * @author Sean A. Irvine
 */
public class A007445 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A007445() {
    super(new A000040(), 0);
    next();
  }
}
