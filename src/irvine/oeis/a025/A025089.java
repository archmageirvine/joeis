package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;

/**
 * A025089 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A025089 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025089() {
    super(new A000032(), false);
    next();
  }
}
