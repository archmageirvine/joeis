package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000045;

/**
 * A024878 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers &gt;= 3), t = (F(2), F(3), F(4), ...).
 * @author Sean A. Irvine
 */
public class A024878 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024878() {
    super(2, new SkipSequence(new A000027(), 1), new SkipSequence(new A000045(), 1), false);
    next();
  }
}
