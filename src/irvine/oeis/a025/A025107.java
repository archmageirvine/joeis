package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000201;

/**
 * A025107 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = (F(2), F(3), F(4), ...), t = A000201</code> (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025107 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025107() {
    super(new SkipSequence(new A000045(), 1), new PrependSequence(new A000201(), 0), false);
    next();
  }
}
