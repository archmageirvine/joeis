package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a023.A023532;

/**
 * A024374 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A023532, t = A001950</code> (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024374 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024374() {
    super(new A023532(), new PrependSequence(new A001950(), 0));
  }
}
