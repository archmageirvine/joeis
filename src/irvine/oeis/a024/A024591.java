package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A024591 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = (F(2), F(3), ...)</code>.
 * @author Sean A. Irvine
 */
public class A024591 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024591() {
    super(new SkipSequence(new A000045(), 1));
  }
}
