package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008578;

/**
 * A024479 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = (1, p(1), p(2), ...)</code>.
 * @author Sean A. Irvine
 */
public class A024479 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024479() {
    super(new PrependSequence(new A008578(), 0));
  }
}
