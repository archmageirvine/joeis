package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;

/**
 * A024689 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A001950</code> (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024689 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024689() {
    super(new PrependSequence(new A001950(), 0));
  }
}
