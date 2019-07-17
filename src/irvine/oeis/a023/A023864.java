package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001477;

/**
 * A023864 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2)</code> and t <code>= (F(2), F(3), F(4), ...), F(n) = Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A023864 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023864() {
    super(new A001477(), new SkipSequence(new A000045(), 1));
  }
}
