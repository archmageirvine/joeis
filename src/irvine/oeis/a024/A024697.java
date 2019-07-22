package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;

/**
 * A024697 <code>a(n) = p(1)p(n) + p(2)p(n-1) + ... + p(k)p(n+1-k)</code>, where k <code>= [ (n+1)/2 ], p = A000040 =</code> the primes.
 * @author Sean A. Irvine
 */
public class A024697 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024697() {
    super(new A008578());
  }
}
