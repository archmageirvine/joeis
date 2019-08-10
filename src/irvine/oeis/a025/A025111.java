package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A025111 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = (F(2), F(3), F(4), ...), t =</code> (primes).
 * @author Sean A. Irvine
 */
public class A025111 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025111() {
    super(new SkipSequence(new A000045(), 1), new A008578(), false);
    next();
  }
}
