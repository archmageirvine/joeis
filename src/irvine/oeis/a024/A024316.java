package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;

/**
 * A024316 a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k), where k=[ (n+1)/2) ], s = A023531.
 * @author Sean A. Irvine
 */
public class A024316 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024316() {
    super(new A023531());
  }
}
