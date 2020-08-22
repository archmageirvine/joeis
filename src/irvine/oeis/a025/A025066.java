package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a023.A023532;

/**
 * A025066 a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1), where k = [ n/2 ] and s = A023532.
 * @author Sean A. Irvine
 */
public class A025066 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025066() {
    super(new A023532(), false);
    next();
  }
}
