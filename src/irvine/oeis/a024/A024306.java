package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;

/**
 * A024306 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s =</code> (natural numbers <code>&gt;= 2), t =</code> (natural numbers <code>&gt;= 3)</code>.
 * @author Sean A. Irvine
 */
public class A024306 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024306() {
    super(new A000027(), new SkipSequence(new A000027(), 1));
  }
}
