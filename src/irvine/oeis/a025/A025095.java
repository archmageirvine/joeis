package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001950;

/**
 * A025095 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (Lucas numbers), t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025095 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025095() {
    super(new A000032(), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
