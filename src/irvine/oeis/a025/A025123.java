package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a023.A023533;

/**
 * A025123 a(n) = s(1)*t(n) + s(2)*t(n-1) + ... + s(k)*t(n-k+1), where k = floor(n/2), s = A001950 (upper Wythoff sequence), t = A023533.
 * @author Sean A. Irvine
 */
public class A025123 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025123() {
    super(new PrependSequence(new A001950(), 0), new A023533(), false);
    next();
  }
}
