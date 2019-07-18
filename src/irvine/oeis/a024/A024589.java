package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a002.A002808;

/**
 * A024589 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (composite numbers), <code>t = (F(2), F(3), ...)</code>.
 * @author Sean A. Irvine
 */
public class A024589 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024589() {
    super(new PrependSequence(new A002808(), 0), new SkipSequence(new A000045(), 1));
  }
}
