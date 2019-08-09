package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A025101 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = (1, p(1), p(2), ...), t = (F(2), F(3), F(4), ...)</code>.
 * @author Sean A. Irvine
 */
public class A025101 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025101() {
    super(new PrependSequence(new A008578(), 0), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
