package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023531;
import irvine.oeis.a023.A023532;

/**
 * A024880 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023531, t = A023532.
 * @author Sean A. Irvine
 */
public class A024880 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024880() {
    super(new A023531(), new A023532(), false);
    next();
  }
}
