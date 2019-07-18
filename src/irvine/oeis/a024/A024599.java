package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a005.A005408;

/**
 * A024599 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (odd natural numbers), <code>t = A000201</code> (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024599 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024599() {
    super(new PrependSequence(new A005408(), 0), new PrependSequence(new A000201(), 0));
  }
}
