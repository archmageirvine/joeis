package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a005.A005408;

/**
 * A025114 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (odd natural numbers), t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025114 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025114() {
    super(new PrependSequence(new A005408(), 0), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
