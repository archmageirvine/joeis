package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023533;

/**
 * A024466 a(n) = s(1)*t(n) + s(2)*t(n-1) + ... + s(k)*t(n+1-k), where k = floor((n+1)/2), s = (Fibonacci numbers), t = A023533.
 * @author Sean A. Irvine
 */
public class A024466 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024466() {
    super(new A000045(), new A023533());
  }
}
