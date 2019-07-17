package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000045;

/**
 * A024309 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s =</code> (natural numbers <code>&gt;= 2), t =</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024309 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024309() {
    super(new A000027(), new A000045());
  }
}
