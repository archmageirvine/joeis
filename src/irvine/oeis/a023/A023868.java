package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;

/**
 * A023868 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2)</code> and t is <code>A023533</code>.
 * @author Sean A. Irvine
 */
public class A023868 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023868() {
    super(new A001477(), new A023533());
  }
}
