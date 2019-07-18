package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a014.A014306;

/**
 * A024602 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (odd natural numbers), <code>t = A014306</code>.
 * @author Sean A. Irvine
 */
public class A024602 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024602() {
    super(new PrependSequence(new A005408(), 0), new A014306());
  }
}
