package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000045;

/**
 * A024315 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers <code>&gt;= 3), t =</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024315 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024315() {
    super(new SkipSequence(new A000027(), 1), new SkipSequence(new A000045(), 1));
  }
}
