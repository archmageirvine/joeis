package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001477;

/**
 * A023860 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2), t = A000045</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A023860 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023860() {
    super(new A001477(), new A000045());
  }
}
