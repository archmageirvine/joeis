package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a023.A023531;

/**
 * A024887 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023531, t = A000201 (lower Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024887 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024887() {
    super(2, new A023531(), new PrependSequence(new A000201(), 0), false);
    next();
  }
}
