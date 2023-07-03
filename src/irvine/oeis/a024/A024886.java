package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a023.A023531;

/**
 * A024886 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023531, t = (odd natural numbers).
 * @author Sean A. Irvine
 */
public class A024886 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024886() {
    super(2, new A023531(), new PrependSequence(new A005408(), 0), false);
    next();
  }
}
