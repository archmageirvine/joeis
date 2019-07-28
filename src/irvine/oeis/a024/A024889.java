package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;
import irvine.oeis.a023.A023533;

/**
 * A024889 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s = A023531, t = A023533</code>.
 * @author Sean A. Irvine
 */
public class A024889 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024889() {
    super(new A023531(), new A023533(), false);
    next();
  }
}
