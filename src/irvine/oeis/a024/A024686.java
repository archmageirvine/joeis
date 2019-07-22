package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;

/**
 * A024686 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A000201</code> (lower Wythoff sequence), <code>t = A001950</code> (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024686 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024686() {
    super(new PrependSequence(new A000201(), 0), new PrependSequence(new A001950(), 0));
  }
}
