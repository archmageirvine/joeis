package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A024459 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (Fibonacci numbers), t = (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A024459 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024459() {
    super(new A000045(), new A000032());
  }
}
