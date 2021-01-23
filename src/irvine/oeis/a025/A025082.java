package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A025082 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (Fibonacci numbers), t = (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A025082 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025082() {
    super(new A000045(), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
