package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A025079 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (Fibonacci numbers), t = (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A025079 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025079() {
    super(new A000045(), new A000032(), false);
    next();
  }
}
