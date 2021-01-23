package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023531;

/**
 * A024318 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k=[ (n+1)/2) ], s = A023531, t = (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024318 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024318() {
    super(new A023531(), new A000045());
  }
}
