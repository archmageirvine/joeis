package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;

/**
 * A025099 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1)</code>, where k <code>= [ n/2 ], s = (1, p(1), p(2), ...)</code>.
 * @author Sean A. Irvine
 */
public class A025099 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025099() {
    super(new PrependSequence(new A008578(), 0), false);
    next();
  }
}
