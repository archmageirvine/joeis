package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a023.A023531;

/**
 * A024882 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023531, t = (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A024882 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024882() {
    super(new A023531(), new A000032(), false);
    next();
  }
}
