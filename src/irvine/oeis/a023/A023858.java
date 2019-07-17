package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;

/**
 * A023858 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where k <code>= floor((n+1)/2), t = A023531</code>.
 * @author Sean A. Irvine
 */
public class A023858 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023858() {
    super(new A001477(), new A023531());
  }
}
