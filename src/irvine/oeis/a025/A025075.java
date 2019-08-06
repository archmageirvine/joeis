package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023532;
import irvine.oeis.a023.A023533;

/**
 * A025075 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = A023532, t = A023533</code>.
 * @author Sean A. Irvine
 */
public class A025075 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025075() {
    super(new A023532(), new A023533(), false);
    next();
  }
}
