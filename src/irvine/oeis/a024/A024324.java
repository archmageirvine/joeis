package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a023.A023531;

/**
 * A024324 a(n) = s(1)*t(n) + s(2)*t(n-1) + ... + s(k)*t(n+1-k), where k = floor((n+1)/2), s = A023531, t = A000201 (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024324 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024324() {
    super(new A023531(), new PrependSequence(new A000201(), 0));
  }
}
