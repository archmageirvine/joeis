package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023533;

/**
 * A024595 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = (F(2), F(3), ...), t = A023533</code>.
 * @author Sean A. Irvine
 */
public class A024595 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024595() {
    super(new SkipSequence(new A000045(), 1), new A023533());
  }
}
