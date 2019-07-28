package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001477;

/**
 * A024861 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers), <code>t = (F(2), F(3), F(4), ... )</code>.
 * @author Sean A. Irvine
 */
public class A024861 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024861() {
    super(new A001477(), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
