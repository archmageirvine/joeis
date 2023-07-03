package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a023.A023531;

/**
 * A024891 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023531, t = (primes).
 * @author Sean A. Irvine
 */
public class A024891 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024891() {
    super(2, new A023531(), new A008578(), false);
    next();
  }
}
