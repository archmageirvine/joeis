package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001950;

/**
 * A024465 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (Fibonacci numbers), <code>t = A001950</code> (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024465 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024465() {
    super(new A000045(), new PrependSequence(new A001950(), 0));
  }
}
