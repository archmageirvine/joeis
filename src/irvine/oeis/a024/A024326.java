package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;
import irvine.oeis.a023.A023533;

/**
 * A024326 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s = A023531, t = A023533</code>.
 * @author Sean A. Irvine
 */
public class A024326 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024326() {
    super(new A023531(), new A023533());
  }
}
