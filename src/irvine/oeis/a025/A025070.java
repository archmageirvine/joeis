package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a018.A018252;
import irvine.oeis.a023.A023532;

/**
 * A025070 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = A023532, t =</code> (composite numbers).
 * @author Sean A. Irvine
 */
public class A025070 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025070() {
    super(new A023532(), new A018252(), false);
    next();
  }
}
