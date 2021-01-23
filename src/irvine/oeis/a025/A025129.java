package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;

/**
 * A025129 a(n) = p(1)p(n) + p(2)p(n-1) + ... + p(k)p(n-k+1), where k = [ n/2 ], p = A000040, the primes.
 * @author Sean A. Irvine
 */
public class A025129 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025129() {
    super(new A008578(), false);
  }
}
