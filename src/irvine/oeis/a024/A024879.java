package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;

/**
 * A024879 a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1), where k = [ n/2 ], s = A023531.
 * @author Sean A. Irvine
 */
public class A024879 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024879() {
    super(2, new A023531(), false);
    next();
  }
}
