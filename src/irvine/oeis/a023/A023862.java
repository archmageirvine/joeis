package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a008.A008578;

/**
 * A023862 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2)</code> and t <code>= A008578 ({1} U</code> primes).
 * @author Sean A. Irvine
 */
public class A023862 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023862() {
    super(new A001477(), new PrependSequence(new A008578(), 0));
  }
}
