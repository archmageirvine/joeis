package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a018.A018252;

/**
 * A025100 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = (1, p(1), p(2), ...), t =</code> (composite numbers).
 * @author Sean A. Irvine
 */
public class A025100 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025100() {
    super(new PrependSequence(new A008578(), 0), new A018252(), false);
    next();
  }
}
