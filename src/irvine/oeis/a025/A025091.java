package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a018.A018252;

/**
 * A025091 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (Lucas numbers), <code>t =</code> (composite numbers).
 * @author Sean A. Irvine
 */
public class A025091 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025091() {
    super(new A000032(), new A018252(), false);
    next();
  }
}
