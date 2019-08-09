package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a008.A008578;

/**
 * A025090 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (Lucas numbers), <code>t = (1, p(1), p(2), ...)</code>.
 * @author Sean A. Irvine
 */
public class A025090 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025090() {
    super(new A000032(), new PrependSequence(new A008578(), 0), false);
    next();
  }
}
