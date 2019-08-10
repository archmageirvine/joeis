package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;

/**
 * A025122 <code>s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1)</code>, where k <code>= [ n/2 ], s = A001950</code> (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025122 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025122() {
    super(new PrependSequence(new A001950(), 0), false);
    next();
  }
}
