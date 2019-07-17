package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000201;

/**
 * A024474 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (Lucas numbers), <code>t = A000201</code> (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024474 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024474() {
    super(new A000032(), new PrependSequence(new A000201(), 0));
  }
}
