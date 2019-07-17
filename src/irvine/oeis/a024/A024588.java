package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;

/**
 * A024588 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (composite numbers).
 * @author Sean A. Irvine
 */
public class A024588 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024588() {
    super(new PrependSequence(new A002808(), 0));
  }
}
