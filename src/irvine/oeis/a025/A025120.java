package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a023.A023533;

/**
 * A025120 a(n) = s(1)*t(n) + s(2)*t(n-1) + ... + s(k)*t(n-k+1), where k = floor(n/2), s = A000201 (lower Wythoff sequence), t = A023533.
 * @author Sean A. Irvine
 */
public class A025120 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025120() {
    super(new PrependSequence(new A000201(), 0), new A023533(), false);
    next();
  }
}
