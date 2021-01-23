package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a023.A023532;

/**
 * A025072 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023532, t = (odd natural numbers).
 * @author Sean A. Irvine
 */
public class A025072 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025072() {
    super(new A023532(), new PrependSequence(new A005408(), 0), false);
    next();
  }
}
