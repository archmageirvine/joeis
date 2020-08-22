package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;

/**
 * A025119 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A000201 (lower Wythoff sequence), t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025119 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025119() {
    super(new PrependSequence(new A000201(), 0), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
