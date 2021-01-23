package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a023.A023531;

/**
 * A024307 a(n) = 2*t(n) + 3*t(n-1) + ... + (k+1)*t(n+1-k), where k=floor((n+1)/2) and t = A023531.
 * @author Sean A. Irvine
 */
public class A024307 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024307() {
    super(new A000027(), new A023531());
  }
}
