package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;

/**
 * A023859 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2)</code>, and t <code>= A023532</code>.
 * @author Sean A. Irvine
 */
public class A023859 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023859() {
    super(new A001477(), new A023532());
  }
}
