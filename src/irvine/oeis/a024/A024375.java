package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023532;
import irvine.oeis.a023.A023533;

/**
 * A024375 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = A023532, t = A023533.
 * @author Sean A. Irvine
 */
public class A024375 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024375() {
    super(new A023532(), new A023533());
  }
}
