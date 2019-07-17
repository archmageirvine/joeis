package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a014.A014306;

/**
 * A023869 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2)</code> and t is <code>A014306</code>.
 * @author Sean A. Irvine
 */
public class A023869 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023869() {
    super(new A001477(), new A014306());
  }
}
