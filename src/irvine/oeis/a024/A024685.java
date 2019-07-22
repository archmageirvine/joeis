package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;

/**
 * A024685 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A000201</code> (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024685 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024685() {
    super(new PrependSequence(new A000201(), 0));
  }
}
