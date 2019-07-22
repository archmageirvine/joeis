package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a023.A023533;

/**
 * A024687 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A000201</code> (lower Wythoff sequence), <code>t = A023533</code>.
 * @author Sean A. Irvine
 */
public class A024687 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024687() {
    super(new PrependSequence(new A000201(), 0), new A023533());
  }
}
