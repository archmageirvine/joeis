package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023533;

/**
 * A025109 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = floor(n/2), s = (F(2), F(3), F(4), ...), t = A023533.
 * @author Sean A. Irvine
 */
public class A025109 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025109() {
    super(new SkipSequence(new A000045(), 1), new A023533(), false);
    next();
  }
}
