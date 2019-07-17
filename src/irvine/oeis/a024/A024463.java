package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a005.A005408;

/**
 * A024463 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (Fibonacci numbers), <code>t =</code> (odd natural numbers).
 * @author Sean A. Irvine
 */
public class A024463 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024463() {
    super(new A000045(), new PrependSequence(new A005408(), 0));
  }
}
