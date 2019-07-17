package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a002.A002808;

/**
 * A023863 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2)</code> and t <code>= A002808</code> (composite numbers).
 * @author Sean A. Irvine
 */
public class A023863 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023863() {
    super(new A001477(), new PrependSequence(new A002808(), 0));
  }
}
