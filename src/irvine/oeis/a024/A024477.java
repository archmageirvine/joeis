package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a014.A014306;

/**
 * A024477 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (Lucas numbers), <code>t = A014306</code>.
 * @author Sean A. Irvine
 */
public class A024477 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024477() {
    super(new A000032(), new A014306());
  }
}
