package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;
import irvine.oeis.a023.A023533;

/**
 * A025126 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = A023533, t = A014306</code>.
 * @author Sean A. Irvine
 */
public class A025126 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025126() {
    super(new A023533(), new A014306(), false);
    next();
  }
}
