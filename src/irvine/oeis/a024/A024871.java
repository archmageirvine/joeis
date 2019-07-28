package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a023.A023532;

/**
 * A024871 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers <code>&gt;= 2), t = A023532</code>.
 * @author Sean A. Irvine
 */
public class A024871 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024871() {
    super(new A000027(), new A023532(), false);
    next();
  }
}
