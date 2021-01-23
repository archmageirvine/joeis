package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a023.A023532;

/**
 * A025073 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023532, t = A000201 (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A025073 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025073() {
    super(new A023532(), new PrependSequence(new A000201(), 0), false);
    next();
  }
}
