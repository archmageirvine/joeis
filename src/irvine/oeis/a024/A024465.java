package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001950;

/**
 * A024465 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (Fibonacci numbers), t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024465 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024465() {
    super(new A000045(), new PrependSequence(new A001950(), 0));
  }
}
