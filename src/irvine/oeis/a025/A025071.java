package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023532;

/**
 * A025071 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023532, t = (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A025071 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025071() {
    super(new A023532(), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
