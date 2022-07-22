package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023533;

/**
 * A024692 a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k), where k = floor((n+1)/2), s = A023533.
 * @author Sean A. Irvine
 */
public class A024692 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024692() {
    super(new A023533());
  }
}
