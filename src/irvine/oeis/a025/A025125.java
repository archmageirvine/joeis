package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023533;

/**
 * A025125 <code>s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1)</code>, where k <code>= [ n/2 ], s = A023533</code>.
 * @author Sean A. Irvine
 */
public class A025125 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025125() {
    super(new A023533(), false);
    next();
  }
}
