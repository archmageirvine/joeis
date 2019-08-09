package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a014.A014306;

/**
 * A025097 <code>s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (Lucas numbers), <code>t = A014306</code>.
 * @author Sean A. Irvine
 */
public class A025097 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025097() {
    super(new A000032(), new A014306(), false);
    next();
  }
}
