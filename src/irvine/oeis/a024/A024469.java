package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;

/**
 * A024469 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A024469 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024469() {
    super(new A000032());
  }
}
