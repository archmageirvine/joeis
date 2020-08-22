package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A025105 a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1), where k = [ n/2 ], s = (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A025105 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025105() {
    super(new SkipSequence(new A000045(), 1), false);
    next();
  }
}
