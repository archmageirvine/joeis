package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A024468 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (Fibonacci numbers), <code>t =</code> (primes).
 * @author Sean A. Irvine
 */
public class A024468 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024468() {
    super(new A000045(), new A008578());
  }
}
