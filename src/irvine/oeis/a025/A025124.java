package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a014.A014306;

/**
 * A025124 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = A001950</code> (upper Wythoff sequence), <code>t = A014306</code>.
 * @author Sean A. Irvine
 */
public class A025124 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025124() {
    super(new PrependSequence(new A001950(), 0), new A014306(), false);
    next();
  }
}
