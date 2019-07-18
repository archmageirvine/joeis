package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a005.A005408;

/**
 * A024592 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = (F(2), F(3), ...), t =</code> (odd natural numbers).
 * @author Sean A. Irvine
 */
public class A024592 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024592() {
    super(new SkipSequence(new A000045(), 1), new PrependSequence(new A005408(), 0));
  }
}
