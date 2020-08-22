package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a023.A023533;

/**
 * A024865 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers), t = A023533.
 * @author Sean A. Irvine
 */
public class A024865 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024865() {
    super(new A001477(), new A023533(), false);
    next();
  }
}
