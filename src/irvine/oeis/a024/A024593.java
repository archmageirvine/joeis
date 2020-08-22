package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000201;

/**
 * A024593 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (F(2), F(3), ...), t = A000201 (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024593 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024593() {
    super(new SkipSequence(new A000045(), 1), new PrependSequence(new A000201(), 0));
  }
}
