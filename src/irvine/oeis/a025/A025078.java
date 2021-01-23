package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A025078 a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n-k+1), where k = [ n/2 ] and s = (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A025078 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025078() {
    super(new A000045(), false);
    next();
  }
}
