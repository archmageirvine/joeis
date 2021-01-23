package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a018.A018252;

/**
 * A025102 s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1), where k = [ n/2 ], s = (composite numbers).
 * @author Sean A. Irvine
 */
public class A025102 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025102() {
    super(new A018252(), false);
    next();
  }
}
