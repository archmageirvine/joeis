package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023533;

/**
 * A025127 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023533, t = (primes).
 * @author Sean A. Irvine
 */
public class A025127 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025127() {
    super(new A023533(), new A008578(), false);
    next();
  }
}
