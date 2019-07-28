package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a023.A023531;

/**
 * A024888 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = A023531, t = A001959</code> (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024888 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024888() {
    super(new A023531(), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
