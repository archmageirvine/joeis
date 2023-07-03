package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a001.A001950;

/**
 * A024864 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers), t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024864 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024864() {
    super(2, new A001477(), new PrependSequence(new A001950(), 0), false);
    next();
  }
}
