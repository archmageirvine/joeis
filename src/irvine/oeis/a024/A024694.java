package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023533;

/**
 * A024694 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A023533, t =</code> (primes).
 * @author Sean A. Irvine
 */
public class A024694 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024694() {
    super(new A023533(), new A008578());
  }
}
