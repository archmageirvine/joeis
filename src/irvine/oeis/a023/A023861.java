package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001477;

/**
 * A023861 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2)</code> and t <code>= A000032</code> (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A023861 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023861() {
    super(new A001477(), new A000032());
  }
}
