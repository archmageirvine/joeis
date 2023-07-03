package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a023.A023531;

/**
 * A024855 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers), t = A023531.
 * @author Sean A. Irvine
 */
public class A024855 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024855() {
    super(2, new A001477(), new A023531(), false);
    next();
  }
}
