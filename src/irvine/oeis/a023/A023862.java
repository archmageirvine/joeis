package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a008.A008578;

/**
 * A023862 a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k), where k=floor((n+1)/2) and t = A008578 ({1} U primes).
 * @author Sean A. Irvine
 */
public class A023862 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023862() {
    super(new A001477(), new PrependSequence(new A008578(), 0));
  }
}
