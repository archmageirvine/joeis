package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a023.A023532;

/**
 * A024370 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A023532, t =</code> (composite numbers).
 * @author Sean A. Irvine
 */
public class A024370 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024370() {
    super(new A023532(), new PrependSequence(new A002808(), 0));
  }
}
