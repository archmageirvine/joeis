package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a008.A008578;

/**
 * A024867 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers), <code>t =</code> (primes).
 * @author Sean A. Irvine
 */
public class A024867 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024867() {
    super(new A001477(), new A008578(), false);
    next();
  }
}
