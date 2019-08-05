package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023532;

/**
 * A025069 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = A023532, t = (1, p(1), p(2), ...)</code>.
 * @author Sean A. Irvine
 */
public class A025069 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025069() {
    super(new A023532(), new PrependSequence(new A008578(), 0), false);
    next();
  }
}
