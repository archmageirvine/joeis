package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a008.A008578;

/**
 * A025117 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (odd natural numbers), <code>t =</code> (primes).
 * @author Sean A. Irvine
 */
public class A025117 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025117() {
    super(new PrependSequence(new A005408(), 0), new A008578(), false);
    next();
  }
}
