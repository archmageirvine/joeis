package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a002.A002808;

/**
 * A024461 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (Fibonacci numbers), <code>t =</code> (composite numbers).
 * @author Sean A. Irvine
 */
public class A024461 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024461() {
    super(new A000045(), new PrependSequence(new A002808(), 0));
  }
}
