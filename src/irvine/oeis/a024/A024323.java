package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a023.A023531;

/**
 * A024323 a(n) = s(1)*t(n) + s(2)*t(n-1) + ... + s(k)*t(n+1-k), where k = floor((n+1)/2), s = A023531, t = (odd natural numbers).
 * @author Sean A. Irvine
 */
public class A024323 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024323() {
    super(new A023531(), new PrependSequence(new A005408(), 0));
  }
}
