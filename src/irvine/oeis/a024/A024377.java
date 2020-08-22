package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023532;

/**
 * A024377 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = A023532, t = (primes).
 * @author Sean A. Irvine
 */
public class A024377 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024377() {
    super(new A023532(), new A008578());
  }
}
