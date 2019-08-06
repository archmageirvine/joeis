package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023532;

/**
 * A025077 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = A023532, t =</code> (primes).
 * @author Sean A. Irvine
 */
public class A025077 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025077() {
    super(new A023532(), new A008578(), false);
    next();
  }
}
