package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a023.A023532;

/**
 * A025074 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023532, t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025074 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025074() {
    super(new A023532(), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
