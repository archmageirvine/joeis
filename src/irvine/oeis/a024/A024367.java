package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023532;

/**
 * A024367 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A023532, t =</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024367 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024367() {
    super(new A023532(), new A000045());
  }
}
