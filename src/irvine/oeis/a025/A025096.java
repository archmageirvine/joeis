package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a023.A023533;

/**
 * A025096 a(n) = s(1)*t(n) + s(2)*t(n-1) + ... + s(k)*t(n-k+1), where k = floor(n/2), s = A000032, t = A023533.
 * @author Sean A. Irvine
 */
public class A025096 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025096() {
    super(2, new A000032(), new A023533(), false);
    next();
  }
}
