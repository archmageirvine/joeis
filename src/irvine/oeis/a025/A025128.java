package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;

/**
 * A025128 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1)</code>, where k <code>= [ n/2 ], s = A014306</code>.
 * @author Sean A. Irvine
 */
public class A025128 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025128() {
    super(new A014306(), false);
    next();
  }
}
