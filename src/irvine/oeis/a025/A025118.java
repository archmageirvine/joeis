package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;

/**
 * A025118 a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1), where k = [ n/2 ], s = A000201 (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025118 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025118() {
    super(new PrependSequence(new A000201(), 0), false);
    next();
  }
}
