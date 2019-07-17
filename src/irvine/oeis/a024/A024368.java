package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a023.A023532;

/**
 * A024368 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A023532, t =</code> (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A024368 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024368() {
    super(new A023532(), new A000032());
  }
}
