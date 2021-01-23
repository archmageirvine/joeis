package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a018.A018252;

/**
 * A025081 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (Fibonacci numbers), t = (composite numbers).
 * @author Sean A. Irvine
 */
public class A025081 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025081() {
    super(new A000045(), new A018252(), false);
    next();
  }
}
