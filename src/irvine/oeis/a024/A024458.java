package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A024458 a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k), where k = [ (n+1)/2 ], s = (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024458 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024458() {
    super(new A000045());
  }
}
