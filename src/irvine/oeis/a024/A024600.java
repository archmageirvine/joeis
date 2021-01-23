package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a005.A005408;

/**
 * A024600 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (odd natural numbers), t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024600 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024600() {
    super(new PrependSequence(new A005408(), 0), new PrependSequence(new A001950(), 0));
  }
}
