package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;

/**
 * A024695 <code>s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A014306</code>.
 * @author Sean A. Irvine
 */
public class A024695 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024695() {
    super(new A014306());
  }
}
